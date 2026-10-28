package m7;

import com.baidu.carlife.protobuf.CarlifeMediaInfoProto;
import com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto;
import com.google.protobuf.p;
import fc.h0;
import h9.o;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8584a;

    public /* synthetic */ g(int i7) {
        this.f8584a = i7;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object value;
        j jVar;
        Object value2;
        j jVar2;
        Object value3;
        j jVar3;
        int i7 = this.f8584a;
        z zVar = z.f12851a;
        switch (i7) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int iIntValue = ((Integer) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                boolean z10 = j.f8589m;
                h0 h0Var = j.f8590n;
                do {
                    value = h0Var.getValue();
                    jVar = (j) value;
                    i9.l.e(jVar, "$this$update");
                } while (!h0Var.f(value, j.a(jVar, false, 0, zBooleanValue, false, false, zBooleanValue2, false, false, iIntValue, 0, 0, 3511)));
                return zVar;
            case 1:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                boolean z11 = j.f8589m;
                h0 h0Var2 = j.f8590n;
                do {
                    value2 = h0Var2.getValue();
                    jVar2 = (j) value2;
                    i9.l.e(jVar2, "$this$update");
                } while (!h0Var2.f(value2, j.a(jVar2, false, 0, false, zBooleanValue3, false, false, zBooleanValue4, false, 0, iIntValue2, 0, 2927)));
                return zVar;
            case 2:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean zBooleanValue6 = ((Boolean) obj3).booleanValue();
                boolean z12 = j.f8589m;
                h0 h0Var3 = j.f8590n;
                do {
                    value3 = h0Var3.getValue();
                    jVar3 = (j) value3;
                    i9.l.e(jVar3, "$this$update");
                } while (!h0Var3.f(value3, j.a(jVar3, false, 0, false, false, zBooleanValue5, false, false, zBooleanValue6, 0, 0, iIntValue3, 1759)));
                return zVar;
            case 3:
                byte[] bArr = (byte[]) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int iIntValue5 = ((Integer) obj3).intValue();
                i9.l.e(bArr, "payload");
                return CarlifeMediaInfoProto.CarlifeMediaInfo.parseFrom(p.f(bArr, iIntValue4, iIntValue5, false));
            default:
                byte[] bArr2 = (byte[]) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int iIntValue7 = ((Integer) obj3).intValue();
                i9.l.e(bArr2, "payload");
                return CarlifeMediaProgressBarProto.CarlifeMediaProgressBar.parseFrom(p.f(bArr2, iIntValue6, iIntValue7, false));
        }
    }
}
