package q0;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f10537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f10538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f10539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f10540d;

    public d(e eVar, b bVar, b bVar2, View view) {
        this.f10537a = eVar;
        this.f10538b = bVar;
        this.f10539c = bVar2;
        this.f10540d = view;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean a(Menu menu) {
        int i7;
        o0.c cVar = (o0.c) this.f10538b.invoke();
        if (i9.l.a(cVar, null)) {
            return false;
        }
        menu.clear();
        ?? r8 = cVar.f9251a;
        int size = r8.size();
        int i10 = 1;
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            o0.b bVar = (o0.b) r8.get(i12);
            if (bVar instanceof o0.d) {
                i7 = i10 + 1;
                final o0.d dVar = (o0.d) bVar;
                MenuItem menuItemAdd = menu.add(i11, i10, i10, dVar.f9252b);
                menuItemAdd.setShowAsAction(2);
                final int i13 = 0;
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: q0.c
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        switch (i13) {
                            case 0:
                                ((o0.d) dVar).f9254d.invoke(((d) this).f10537a);
                                break;
                            default:
                                Context context = (Context) dVar;
                                TextClassification textClassification = (TextClassification) this;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e7) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e7);
                                        return true;
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (bVar instanceof o0.h) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i7 = i10 + 1;
                        final Context context = this.f10540d.getContext();
                        o0.h hVar = (o0.h) bVar;
                        final TextClassification textClassification = hVar.f9261b;
                        int i14 = hVar.f9262c;
                        if (i14 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i10, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(textClassification.getIcon());
                            final int i15 = 1;
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: q0.c
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    switch (i15) {
                                        case 0:
                                            ((o0.d) context).f9254d.invoke(((d) textClassification).f10537a);
                                            break;
                                        default:
                                            Context context2 = (Context) context;
                                            TextClassification textClassification2 = (TextClassification) textClassification;
                                            String text = textClassification2.getText();
                                            PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                            if (Build.VERSION.SDK_INT < 34) {
                                                activity.send();
                                            } else {
                                                try {
                                                    activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                                } catch (PendingIntent.CanceledException e7) {
                                                    Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e7);
                                                    return true;
                                                }
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            boolean z10 = i14 == 0;
                            final RemoteAction remoteActionC = k8.b.c(textClassification.getActions().get(i14));
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, z10 ? R.id.textAssist : 0, i10, remoteActionC.getTitle());
                            menuItemAdd3.setShowAsAction(z10 ? 2 : 0);
                            if (z10 || remoteActionC.shouldShowIcon()) {
                                menuItemAdd3.setIcon(remoteActionC.getIcon().loadDrawable(context));
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: q0.q
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    PendingIntent actionIntent = remoteActionC.getActionIntent();
                                    if (Build.VERSION.SDK_INT < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e7) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e7);
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                } else if (bVar instanceof o0.f) {
                    i11++;
                }
            }
            i10 = i7;
        }
        return true;
    }
}
