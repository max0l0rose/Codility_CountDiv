public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.solution(6,11, 2));
//        System.out.println(solution.solution(6,12, 2));
//        System.out.println(solution.solution(11, 345, 17));

//        System.out.println(solution.solution(1,5, 1));
//        System.out.println(solution.solution(1,1, 2));
//        System.out.println(solution.solution(1,1, 1));

        //System.out.println(solution.solution(18, 27, 19));

        for (int i = 0; i < 20; i++) {
            int A = (int)(Math.random()*20);
            System.out.println(solution.solution(A, A + (int)(Math.random()*20), (int)(Math.random()*20) + 1));
        }
    }
}
