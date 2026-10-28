package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import g5.b;
import g5.c;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f976a = bVar.f(iconCompat.f976a, 1);
        byte[] bArr = iconCompat.f978c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f5923e;
            int i7 = parcel.readInt();
            if (i7 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i7];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f978c = bArr;
        iconCompat.f979d = bVar.g(iconCompat.f979d, 3);
        iconCompat.f980e = bVar.f(iconCompat.f980e, 4);
        iconCompat.f981f = bVar.f(iconCompat.f981f, 5);
        iconCompat.f982g = (ColorStateList) bVar.g(iconCompat.f982g, 6);
        String string = iconCompat.f984i;
        if (bVar.e(7)) {
            string = ((c) bVar).f5923e.readString();
        }
        iconCompat.f984i = string;
        String string2 = iconCompat.f985j;
        if (bVar.e(8)) {
            string2 = ((c) bVar).f5923e.readString();
        }
        iconCompat.f985j = string2;
        iconCompat.f983h = PorterDuff.Mode.valueOf(iconCompat.f984i);
        switch (iconCompat.f976a) {
            case -1:
                Parcelable parcelable = iconCompat.f979d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f977b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f979d;
                if (parcelable2 != null) {
                    iconCompat.f977b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f978c;
                iconCompat.f977b = bArr3;
                iconCompat.f976a = 3;
                iconCompat.f980e = 0;
                iconCompat.f981f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f978c, Charset.forName("UTF-16"));
                iconCompat.f977b = str;
                if (iconCompat.f976a == 2 && iconCompat.f985j == null) {
                    iconCompat.f985j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f977b = iconCompat.f978c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f984i = iconCompat.f983h.name();
        switch (iconCompat.f976a) {
            case -1:
                iconCompat.f979d = (Parcelable) iconCompat.f977b;
                break;
            case 1:
            case 5:
                iconCompat.f979d = (Parcelable) iconCompat.f977b;
                break;
            case 2:
                iconCompat.f978c = ((String) iconCompat.f977b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f978c = (byte[]) iconCompat.f977b;
                break;
            case 4:
            case 6:
                iconCompat.f978c = iconCompat.f977b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i7 = iconCompat.f976a;
        if (-1 != i7) {
            bVar.j(i7, 1);
        }
        byte[] bArr = iconCompat.f978c;
        if (bArr != null) {
            bVar.i(2);
            Parcel parcel = ((c) bVar).f5923e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f979d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i10 = iconCompat.f980e;
        if (i10 != 0) {
            bVar.j(i10, 4);
        }
        int i11 = iconCompat.f981f;
        if (i11 != 0) {
            bVar.j(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.f982g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        String str = iconCompat.f984i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).f5923e.writeString(str);
        }
        String str2 = iconCompat.f985j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).f5923e.writeString(str2);
        }
    }
}
