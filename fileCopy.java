import java.io.*;

public class fileCopy {
    public static void main(String[] args) {
        // try-with-resources 문을 사용하여 자원 해제 자동 처리
        try (
            BufferedReader br = new BufferedReader(new FileReader("C:/CODE/JAVA/txtSave.txt"));
            FileWriter fw = new FileWriter("C:/CODE/JAVA/fileCopy.txt")
        ) {
            String content;

            while ((content = br.readLine()) != null) { // 파일에서 한 줄씩 읽기
                fw.write(content + "\n"); // 읽은 내용을 새 파일에 쓰기
            }

            System.out.println("Copy!");
        } catch (IOException e) { // 파일 읽기, 쓰기 중 발생할 수 있는 예외 처리
            System.err.println("파일 처리 중 오류 발생: " + e.getMessage());
        }
    }
}
