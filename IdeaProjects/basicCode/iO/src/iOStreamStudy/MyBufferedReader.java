package IOStreamStudy;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {
    private Reader r;

    public MyBufferedReader(Reader r) {
        this.r = r;
    }

    public String readLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while ((ch = r.read()) != -1){
            if(ch == '\r'){
                continue;
            }
            if(ch == '\n'){
                return sb.toString();
            }else {
                sb.append(ch);
            }
        }

        //
        if(sb.length() >0){
            return sb.toString();
        }
            return null;
        };

    public void close() throws IOException{
        this.r.close();
    }
    }

