class solution {
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        char temp;
        while( i <= j ){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }  

        int k = 0;
        while(k < s.length){
            System.out.print(s[k]);
            k++;
        }
    }

    public static void main(String args[]){
        char s[] = {'O','M','K','A','R'};
        reverseString(s);
    }
}

