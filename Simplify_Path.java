class Solution {
    public String simplifyPath(String path) {

        String p = "";
        String the_path = "";
        Stack stack1 = new Stack();


        String [] s = path.split("/");

        for(int i=0; i<s.length; i++){
            if(s[i].equals(".") || s[i].equals("")){
                continue;
            }
            else if(stack1.empty() && s[i].equals("..")){
                continue;
            }
            else if(!stack1.empty() && s[i].equals("..")){
                stack1.pop();
            }
            else{
                stack1.push(s[i]);
            }
        }

        //System.out.println(stack1);

        if(stack1.empty())
            the_path = "/";

        while(!stack1.empty()){
            p += "/" + stack1.pop();
        }

        String [] str = p.split("/");
        for(int i=str.length-1; i>=0; i--){
            the_path += "/" + str[i];
        }

        return the_path.substring(0,the_path.length()-1);

    }
}

/***

Input: "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.

Input: "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.

Input: "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.

Input: "/a/./b/../../c/"
Output: "/c"

Input: "/a/../../b/../c//.//"
Output: "/c"

Input: "/a//b////c/d//././/.."
Output: "/a/b/c"

***/
