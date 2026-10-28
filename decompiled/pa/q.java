package pa;

/* JADX INFO: loaded from: classes.dex */
public final class q implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f10354a = new q();

    @Override // h9.k
    public final Object invoke(Object obj) {
        String str = (String) obj;
        i9.l.e(str, "it");
        if (str.length() <= 1) {
            return str;
        }
        return "L" + str + ';';
    }
}
