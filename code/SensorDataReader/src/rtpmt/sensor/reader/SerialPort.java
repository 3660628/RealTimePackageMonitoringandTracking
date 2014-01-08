/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtpmt.sensor.reader;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kumar
 */
public class SerialPort implements SerialPortInterface {

    private final InputStream input;
    private final OutputStream output;

    public SerialPort(InputStream _input, OutputStream _output) {

        this.input = _input;
        this.output = _output;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() throws IOException {
        input.close();
        output.close();
    }

    @Override
    public byte read() throws IOException {
        byte data = 0;

        data = (byte) (input.read() & 0xff);

        return data;
    }

    @Override
    public boolean write(byte data) throws IOException {

        output.write(data);
        return true;

    }

    @Override
    public boolean write(byte[] data) throws IOException {

        output.write(data);
        return true;
    }

    @Override
    public void flush() {
        try {
            output.flush();
        } catch (IOException ex) {
            Logger.getLogger(SerialPort.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean isAvailable() throws IOException {

        return input.available() > 0;

    }

}