package g4;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f5912a = new String[0];

    public static void a(EditorInfo editorInfo, CharSequence charSequence) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            b.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i7 >= 30) {
            b.a(editorInfo, charSequence);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 : i10;
        if (i10 <= i11) {
            i10 = i11;
        }
        int length = charSequence.length();
        if (i12 < 0 || i10 > length) {
            c(editorInfo, null, 0, 0);
            return;
        }
        int i13 = editorInfo.inputType & 4095;
        if (i13 == 129 || i13 == 225 || i13 == 18) {
            c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            c(editorInfo, charSequence, i12, i10);
            return;
        }
        int i14 = i10 - i12;
        int i15 = i14 > 1024 ? 0 : i14;
        int i16 = 2048 - i15;
        int iMin = Math.min(charSequence.length() - i10, i16 - Math.min(i12, (int) (((double) i16) * 0.8d)));
        int iMin2 = Math.min(i12, i16 - iMin);
        int i17 = i12 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i17))) {
            i17++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i10 + iMin) - 1))) {
            iMin--;
        }
        int i18 = iMin2 + i15;
        c(editorInfo, i15 != i14 ? TextUtils.concat(charSequence.subSequence(i17, i17 + iMin2), charSequence.subSequence(i10, iMin + i10)) : charSequence.subSequence(i17, i18 + iMin + i17), iMin2, i18);
    }

    public static void b(EditorInfo editorInfo, boolean z10) {
        if (Build.VERSION.SDK_INT >= 35) {
            c.a(editorInfo, z10);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z10);
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence, int i7, int i10) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i7);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i10);
    }
}
