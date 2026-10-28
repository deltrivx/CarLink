package xa;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements v {
    static {
        int i7 = g.f14785b;
    }

    public static void b(a aVar) throws q {
        if (aVar == null || aVar.isInitialized()) {
            return;
        }
        q qVar = new q(new cc.s().getMessage());
        qVar.f14823a = aVar;
        throw qVar;
    }

    public final a c(ByteArrayInputStream byteArrayInputStream, g gVar) throws q {
        a aVar;
        try {
            int i7 = byteArrayInputStream.read();
            if (i7 == -1) {
                aVar = null;
            } else {
                if ((i7 & 128) != 0) {
                    i7 &= 127;
                    int i10 = 7;
                    while (true) {
                        if (i10 < 32) {
                            int i11 = byteArrayInputStream.read();
                            if (i11 == -1) {
                                throw q.a();
                            }
                            i7 |= (i11 & 127) << i10;
                            if ((i11 & 128) == 0) {
                                break;
                            }
                            i10 += 7;
                        } else {
                            while (true) {
                                if (i10 >= 64) {
                                    throw new q("CodedInputStream encountered a malformed varint.");
                                }
                                int i12 = byteArrayInputStream.read();
                                if (i12 == -1) {
                                    throw q.a();
                                }
                                if ((i12 & 128) == 0) {
                                    break;
                                }
                                i10 += 7;
                            }
                        }
                    }
                }
                e eVar = new e(new com.google.protobuf.a(byteArrayInputStream, i7, 1));
                a aVar2 = (a) a(eVar, gVar);
                try {
                    eVar.a(0);
                    aVar = aVar2;
                } catch (q e7) {
                    e7.f14823a = aVar2;
                    throw e7;
                }
            }
            b(aVar);
            return aVar;
        } catch (IOException e10) {
            throw new q(e10.getMessage());
        }
    }
}
