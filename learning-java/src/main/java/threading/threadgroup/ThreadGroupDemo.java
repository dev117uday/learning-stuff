package threading.threadgroup;

// thread priority is inherited

public class ThreadGroupDemo {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        var parent = new ThreadGroup("Parent");
        System.out.println(parent.getName());
        var child = new ThreadGroup(parent, "child");
        System.out.println(child.getParent().getName());
    }
}
