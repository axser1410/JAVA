package examen.mavenproject1;

public class NodoCuenta {
    private int CI;
    private float saldo;
    private NodoCuenta sig;

    public NodoCuenta() {
        this.sig = null;
    }

    public int getCI() { return CI; }
    public void setCI(int CI) { this.CI = CI; }
    public float getSaldo() { return saldo; }
    public void setSaldo(float saldo) { this.saldo = saldo; }
    public NodoCuenta getSig() { return sig; }
    public void setSig(NodoCuenta sig) { this.sig = sig; }
}

