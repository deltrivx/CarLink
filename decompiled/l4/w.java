package l4;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f8047d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da.a f8049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f8050c = 0;

    public w(da.a aVar, int i7) {
        this.f8049b = aVar;
        this.f8048a = i7;
    }

    public final int a(int i7) {
        m4.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f4320d;
        int i10 = iA + aVarB.f4317a;
        return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final m4.a b() {
        ThreadLocal threadLocal = f8047d;
        m4.a aVar = (m4.a) threadLocal.get();
        if (aVar == null) {
            aVar = new m4.a();
            threadLocal.set(aVar);
        }
        m4.b bVar = (m4.b) this.f8049b.f3847b;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i7 = iA + bVar.f4317a;
            int i10 = (this.f8048a * 4) + ((ByteBuffer) bVar.f4320d).getInt(i7) + i7 + 4;
            int i11 = ((ByteBuffer) bVar.f4320d).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f4320d;
            aVar.f4320d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f4317a = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar.f4318b = i12;
                aVar.f4319c = ((ByteBuffer) aVar.f4320d).getShort(i12);
                return aVar;
            }
            aVar.f4317a = 0;
            aVar.f4318b = 0;
            aVar.f4319c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i7;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        m4.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f4320d).getInt(iA + aVarB.f4317a) : 0));
        sb2.append(", codepoints:");
        m4.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i10 = iA2 + aVarB2.f4317a;
            i7 = ((ByteBuffer) aVarB2.f4320d).getInt(((ByteBuffer) aVarB2.f4320d).getInt(i10) + i10);
        } else {
            i7 = 0;
        }
        for (int i11 = 0; i11 < i7; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
