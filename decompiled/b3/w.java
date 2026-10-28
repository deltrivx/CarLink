package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f1462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1463b = 0;

    static {
        n3.s[] sVarArr = n3.q.f8753b;
        f1462a = n3.q.f8754c;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    public static final v a(v vVar, int i7, int i10, long j5, m3.q qVar, x xVar, m3.i iVar, int i11, int i12, m3.s sVar) {
        long j10;
        x xVar2;
        int i13 = i7;
        int i14 = i10;
        long j11 = j5;
        m3.q qVar2 = qVar;
        x xVar3 = xVar;
        m3.i iVar2 = iVar;
        int i15 = i11;
        int i16 = i12;
        m3.s sVar2 = sVar;
        if (i13 != Integer.MIN_VALUE) {
            j10 = 0;
            if (i13 == vVar.f1453a) {
            }
            n3.s[] sVarArr = n3.q.f8753b;
            if ((j11 & 1095216660480L) == j10) {
                j11 = vVar.f1455c;
            }
            if (qVar2 == null) {
                qVar2 = vVar.f1456d;
            }
            if (i13 == Integer.MIN_VALUE) {
                i13 = vVar.f1453a;
            }
            if (i14 == Integer.MIN_VALUE) {
                i14 = vVar.f1454b;
            }
            xVar2 = vVar.f1457e;
            if (xVar2 != null && xVar3 == null) {
                xVar3 = xVar2;
            }
            if (iVar2 == null) {
                iVar2 = vVar.f1458f;
            }
            if (i15 == 0) {
                i15 = vVar.f1459g;
            }
            if (i16 == Integer.MIN_VALUE) {
                i16 = vVar.f1460h;
            }
            if (sVar2 == null) {
                sVar2 = vVar.f1461i;
            }
            return new v(i13, i14, j11, qVar2, xVar3, iVar2, i15, i16, sVar2);
        }
        j10 = 0;
        n3.s[] sVarArr2 = n3.q.f8753b;
        if (((j11 & 1095216660480L) == j10 || n3.q.a(j11, vVar.f1455c)) && ((qVar2 == null || qVar2.equals(vVar.f1456d)) && ((i14 == Integer.MIN_VALUE || i14 == vVar.f1454b) && ((xVar3 == null || xVar3.equals(vVar.f1457e)) && ((iVar2 == null || iVar2.equals(vVar.f1458f)) && ((i15 == 0 || i15 == vVar.f1459g) && ((i16 == Integer.MIN_VALUE || i16 == vVar.f1460h) && (sVar2 == null || sVar2.equals(vVar.f1461i))))))))) {
            return vVar;
        }
        n3.s[] sVarArr3 = n3.q.f8753b;
        if ((j11 & 1095216660480L) == j10) {
            j11 = vVar.f1455c;
        }
        if (qVar2 == null) {
            qVar2 = vVar.f1456d;
        }
        if (i13 == Integer.MIN_VALUE) {
            i13 = vVar.f1453a;
        }
        if (i14 == Integer.MIN_VALUE) {
            i14 = vVar.f1454b;
        }
        xVar2 = vVar.f1457e;
        if (xVar2 != null) {
            xVar3 = xVar2;
        }
        if (iVar2 == null) {
            iVar2 = vVar.f1458f;
        }
        if (i15 == 0) {
            i15 = vVar.f1459g;
        }
        if (i16 == Integer.MIN_VALUE) {
            i16 = vVar.f1460h;
        }
        if (sVar2 == null) {
            sVar2 = vVar.f1461i;
        }
        return new v(i13, i14, j11, qVar2, xVar3, iVar2, i15, i16, sVar2);
    }
}
