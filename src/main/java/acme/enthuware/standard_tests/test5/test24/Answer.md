# Explanation

    "String".replace('g','g')=="String"

There are 2 points to remember:
1. replace(char oldChar, char newChar) method returns the same String object if both the parameters are same, i.e. if there is no change. Thus, "String" == "String".replace('g', 'g') will return true.
2. replace(CharSequence oldSeq,  CharSequence newSeq) method returns a new String object even if there is no change after replacement. Thus, "String" == "String".replace("g", "g") will return false.
