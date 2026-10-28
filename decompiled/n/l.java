package n;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i7) {
        callback.onProvideKeyboardShortcuts(list, menu, i7);
    }
}
