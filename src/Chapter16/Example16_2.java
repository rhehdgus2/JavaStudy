package Chapter16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

class Example16_2 {
    public static void main(String args[]) throws Exception {
        URL url = new URL("http://www.codehobo.com:80/sample/"
                + "hello.html?referer=codehobo#index1");
        // URLConnection 열기
        URLConnection connection = url.openConnection();
        // 컨텐츠 유형 설정
        connection.setRequestProperty("Content-Type", "text/html");

        // InputStream을 이용하여 데이터 읽기
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }

        // URL의 각 정보 출력
        System.out.println("url.getAuthority():" + url.getAuthority());
        System.out.println("url.getDefaultPort():" + url.getDefaultPort());
        System.out.println("url.getPort():" + url.getPort());
        System.out.println("url.getFile():" + url.getFile());
        System.out.println("url.getHost():" + url.getHost());
        System.out.println("url.getPath():" + url.getPath());
        System.out.println("url.getProtocol():" + url.getProtocol());
        System.out.println("url.getQuery():" + url.getQuery());
        System.out.println("url.getRef():" + url.getRef());
        System.out.println("url.getUserInfo():" + url.getUserInfo());
        System.out.println("url.toExternalForm():" + url.toExternalForm());
        System.out.println("url.toURI():" + url.toURI());
    }
}