package Hilos.Ejemplos;

    class HiloPrioridad extends Thread {
    public HiloPrioridad(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.getName() + " con prioridad " + this.getPriority() + " - iteración " + i);
            Thread.yield(); // Cede el control
        }
    }

    public static void main(String[] args) {
        HiloPrioridad hilo1 = new HiloPrioridad("Hilo 1");
        HiloPrioridad hilo2 = new HiloPrioridad("Hilo 2");
        HiloPrioridad hilo3 = new HiloPrioridad("Hilo 3");

        // Ajustamos la prioridad de los hilos
        hilo1.setPriority(Thread.MIN_PRIORITY); // Prioridad más baja
        hilo2.setPriority(Thread.NORM_PRIORITY); // Prioridad media (por defecto)
        hilo3.setPriority(Thread.MAX_PRIORITY); // Prioridad más alta

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
