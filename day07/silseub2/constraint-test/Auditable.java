public abstract class Auditable {
    protected void audit(String msg) { System.out.println("[감사] " + msg); }
}
