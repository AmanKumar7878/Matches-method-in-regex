public class MatchesMethod {
    public static void main(String[] args) {
        String str[] = {"amankumardagur7878@gmail.com","aman","kumar"};
        for (String result:str)
        {
            if(result.matches("[a-z]+@gmail.com")==true)
            {
                System.out.println(result);
            }

        }
       // System.out.println(str.matches("[a-z]{4}"));
    }
}
