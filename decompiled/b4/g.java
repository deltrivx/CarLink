package b4;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1487e;

    public g(String str, String str2, String str3, List list) {
        str.getClass();
        this.f1483a = str;
        str2.getClass();
        this.f1484b = str2;
        this.f1485c = str3;
        list.getClass();
        this.f1486d = list;
        this.f1487e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f1483a + ", mProviderPackage: " + this.f1484b + ", mQuery: " + this.f1485c + ", mCertificates:");
        int i7 = 0;
        while (true) {
            List list = this.f1486d;
            if (i7 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i7);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i7++;
        }
    }
}
