package test;

public class Section5_7 {

    public static void main(String[] args) {
        String id = "ㅓava";
        String password = "5678";

        if (id.equals("java") && password.equals("1234")) {
            System.out.println("로그인 성공");
        } else if (!id.equals("java") && password.equals("1234")) {
            System.out.println("아이디가 틀렸습니다");
        } else if (id.equals("java") && !password.equals("1234")) {
            System.out.println("비밀번호가 틀렸습니다");
        } else {
            System.out.println("아이디와 비밀번호가 틀렸습니다");
        }
    }
}