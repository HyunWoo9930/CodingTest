package CodingTest.Programmers.Level1.KaKao.Solved;

public class CodingTest_SecretMap {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] answer = new String[n];
        StringBuilder[] arr1Builder = tenTotwo(arr1,n);
        System.out.println();
        StringBuilder[] arr2Builder = tenTotwo(arr2,n);

        for(int i = 0;i<n;i++) {
            String tmp = "";
            for(int j = 0;j<n;j++) {
                if (arr1Builder[i].charAt(j) == '1' || arr2Builder[i].charAt(j) == '1'){
                    tmp += "#";
                }else {
                    tmp += " ";
                }
                answer[i] = tmp;
            }
            System.out.println(answer[i]);
        }
    }


    public static StringBuilder[] tenTotwo(int[] arr,int n) {
        int a = 0;
        StringBuilder[] arr1Totwo = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            StringBuilder tenTotwo = new StringBuilder("");
            for (int j = 0; j < n; j++) {
                tenTotwo.append("0");
            }
            while (arr[i] != 0) {
                if (arr[i] % 2 == 1) {
                    tenTotwo.setCharAt(n - (a + 1), '1');
                }
                arr[i] /= 2;
                a++;
            }
            a = 0;
            arr1Totwo[i] = tenTotwo;
            System.out.println(arr1Totwo[i]);
        }
        return arr1Totwo;
    }
}
