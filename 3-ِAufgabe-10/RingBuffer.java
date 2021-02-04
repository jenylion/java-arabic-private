public class RingBuffer{
    public int write_index;
    public int read_index;
    public boolean is_full;
    public boolean is_empty;
    double [] data;

    public RingBuffer() {
        this.write_index = 0;
        this.read_index = 0;
        this.is_full = false;
        this.is_empty = true;
    }
    public static void main(String[] args) {
        // here you can change varables and values
        RingBuffer x = new RingBuffer();
        RingBuffer.init(x , 10);
        RingBuffer.write(x, 5);
        System.out.println(RingBuffer.read(x));


    }

    public static void init ( RingBuffer buffer , int size ){
        // buffer.write_index = 0;
        // buffer.read_index = 0;
        // buffer.is_full = false;
        // buffer.is_empty = true;
        buffer.data = new double[size];
        for (int i = 0; i < size; i++) {
            buffer.data[i] = 0;
        }
    }

    public static void write ( RingBuffer buffer , double value ) {
        if (buffer.is_full) {
            System.out.println("Error: RingBuffer is full");
        } else {
            buffer.data[buffer.write_index] = value;
            if (buffer.write_index + 1 == buffer.data.length) {
                buffer.is_full = true;
            } else {
                buffer.is_full = false;
                buffer.is_empty = false;
                buffer.write_index += 1; // ++
            }
        }
    }
    public static double read ( RingBuffer buffer ) {
        if (buffer.is_empty) {
            System.out.println("Error: RingBuffer is empty");
            return(Double.NaN);
        } else {
            if (buffer.read_index + 1 == buffer.data.length || buffer.data[buffer.read_index] == 0) {
                buffer.is_empty = true;
                System.out.println("Error: RingBuffer is empty");
                return(Double.NaN);
            } else {
                if (buffer.data[buffer.read_index] != 0) {
                    int tempIdx = buffer.read_index;
                    buffer.read_index = buffer.read_index + 1;
                    return (buffer.data[tempIdx]);
                } else {
                    buffer.is_empty = true;
                    System.out.println("Error: RingBuffer is empty");
                    return(Double.NaN);
                }
                
            }
        }
    }

}