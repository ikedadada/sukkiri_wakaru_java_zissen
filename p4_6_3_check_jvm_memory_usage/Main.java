package p4_6_3_check_jvm_memory_usage;

public class Main {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("JVMが使用できる最大メモリ: " + rt.maxMemory() / 1024 / 1024 + "MB");
        System.out.println("JVMが使用中のメモリ: " + rt.totalMemory() / 1024 / 1024 + "MB");
        System.out.println("JVMが空きメモリ: " + rt.freeMemory() / 1024 / 1024 + "MB");
    }
}
