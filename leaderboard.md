- name: Update Leaderboard
  if: steps.validate.outputs.valid == 'true' && steps.dup.outputs.dup == 'false'
  run: |
    USER="${{ steps.extract.outputs.user }}"
    FLAG="${{ steps.extract.outputs.flag }}"
    POINTS="${{ steps.validate.outputs.points }}"

    if grep -q "| $USER |" leaderboard.md; then
      LINE=$(grep "| $USER |" leaderboard.md)

      OLD_POINTS=$(echo "$LINE" | cut -d'|' -f3 | tr -d ' ')
      OLD_FLAGS=$(echo "$LINE" | cut -d'|' -f4 | tr -d ' ')

      # SAFETY CHECK
      if [ -z "$OLD_POINTS" ]; then
        OLD_POINTS=0
      fi

      NEW_POINTS=$((OLD_POINTS + POINTS))

      sed -i "s|$LINE||" leaderboard.md
      echo "| $USER | $NEW_POINTS | $OLD_FLAGS,$FLAG |" >> leaderboard.md

    else
      echo "| $USER | $POINTS | $FLAG |" >> leaderboard.md
    fi
| officialhari | 20 | varman |
