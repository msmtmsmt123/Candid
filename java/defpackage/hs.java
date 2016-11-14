package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.becandid.candid.activities.BaseActivity;
import rx.schedulers.Schedulers;

/* compiled from: MeHistoryFragment */
public class hs extends Fragment {
    private View a;
    private RecyclerView b;
    private hf c;
    private View d;
    private SwipeRefreshLayout e;
    private apk f;

    public apk a() {
        return ie.a().g(0).b(Schedulers.io()).a(apn.a()).b(new hs$1(this));
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.a = inflater.inflate(2130968672, container, false);
        this.d = this.a.findViewById(2131624443);
        this.b = (RecyclerView) this.a.findViewById(2131624442);
        LayoutManager historyLayoutManager = new LinearLayoutManager(getContext());
        this.b.setLayoutManager(historyLayoutManager);
        this.c = new hf((BaseActivity) getActivity());
        this.b.setAdapter(this.c);
        this.b.addOnScrollListener(new hs$2(this, (LinearLayoutManager) historyLayoutManager, this.c));
        ItemAnimator animator = this.b.getItemAnimator();
        if (animator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) animator).setSupportsChangeAnimations(false);
        }
        this.e = (SwipeRefreshLayout) this.a.findViewById(2131624441);
        this.e.setOnRefreshListener(new hs$3(this));
        this.f = a();
        return this.a;
    }

    public void b() {
        if (this.c != null) {
            this.f = a();
        }
    }
}
