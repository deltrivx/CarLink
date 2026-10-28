package a4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale[] f34c = new Locale[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale[] f35a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f35a = f34c;
            this.f36b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < localeArr.length; i7++) {
            Locale locale = localeArr[i7];
            if (locale == null) {
                throw new NullPointerException(a2.f.F("list[", "] is null", i7));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb2.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb2.append('-');
                    sb2.append(locale2.getCountry());
                }
                if (i7 < localeArr.length - 1) {
                    sb2.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f35a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f36b = sb2.toString();
    }

    @Override // a4.g
    public final String a() {
        return this.f36b;
    }

    @Override // a4.g
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Locale[] localeArr = ((f) obj).f35a;
        Locale[] localeArr2 = this.f35a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i7 = 0; i7 < localeArr2.length; i7++) {
            if (!localeArr2[i7].equals(localeArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // a4.g
    public final Locale get(int i7) {
        if (i7 < 0) {
            return null;
        }
        Locale[] localeArr = this.f35a;
        if (i7 < localeArr.length) {
            return localeArr[i7];
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f35a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // a4.g
    public final boolean isEmpty() {
        return this.f35a.length == 0;
    }

    @Override // a4.g
    public final int size() {
        return this.f35a.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i7 = 0;
        while (true) {
            Locale[] localeArr = this.f35a;
            if (i7 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i7]);
            if (i7 < localeArr.length - 1) {
                sb2.append(',');
            }
            i7++;
        }
    }
}
