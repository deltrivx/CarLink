package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import g5.b;
import g5.c;
import g5.d;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVarH = remoteActionCompat.f970a;
        boolean z10 = true;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        remoteActionCompat.f970a = (IconCompat) dVarH;
        CharSequence charSequence = remoteActionCompat.f971b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f5923e);
        }
        remoteActionCompat.f971b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f972c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f5923e);
        }
        remoteActionCompat.f972c = charSequence2;
        remoteActionCompat.f973d = (PendingIntent) bVar.g(remoteActionCompat.f973d, 4);
        boolean z11 = remoteActionCompat.f974e;
        if (bVar.e(5)) {
            z11 = ((c) bVar).f5923e.readInt() != 0;
        }
        remoteActionCompat.f974e = z11;
        boolean z12 = remoteActionCompat.f975f;
        if (!bVar.e(6)) {
            z10 = z12;
        } else if (((c) bVar).f5923e.readInt() == 0) {
            z10 = false;
        }
        remoteActionCompat.f975f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f970a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f971b;
        bVar.i(2);
        Parcel parcel = ((c) bVar).f5923e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f972c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f973d, 4);
        boolean z10 = remoteActionCompat.f974e;
        bVar.i(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f975f;
        bVar.i(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
