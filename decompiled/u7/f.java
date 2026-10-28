package u7;

import i9.l;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import t8.j;
import u8.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static j a(String str) {
        l.e(str, "format");
        long jCurrentTimeMillis = System.currentTimeMillis();
        List listJ0 = zb.j.J0(str, new String[]{"|"}, 2);
        String str2 = (String) p.n0(0, listJ0);
        if (str2 == null) {
            str2 = "HH:mm:ss EEE";
        }
        String str3 = (String) p.n0(1, listJ0);
        if (str3 == null) {
            str3 = "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.getDefault());
        if (zb.j.B0(str3)) {
            str3 = null;
        }
        return new j(simpleDateFormat.format(Long.valueOf(jCurrentTimeMillis)), str3 != null ? new SimpleDateFormat(str3, Locale.getDefault()).format(Long.valueOf(jCurrentTimeMillis)) : null);
    }
}
