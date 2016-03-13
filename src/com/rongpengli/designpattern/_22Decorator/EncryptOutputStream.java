package com.rongpengli.designpattern._22Decorator;

import java.io.IOException;
import java.io.OutputStream;

public class EncryptOutputStream extends OutputStream {
    private OutputStream os = null;

    public EncryptOutputStream(OutputStream os) {
        this.os = os;
    }

    @Override
    public void write(int b) throws IOException {
        b = b + 2;
        if (b >= (97 + 26)) {
            b = b - 26;
        }
        os.write(b);
    }

}
