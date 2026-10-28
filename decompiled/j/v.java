package j;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static a4.e b(Configuration configuration) {
        return a4.e.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(a4.e eVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(eVar.f33a.a()));
    }

    public static void d(Configuration configuration, a4.e eVar) {
        configuration.setLocales(LocaleList.forLanguageTags(eVar.f33a.a()));
    }
}
