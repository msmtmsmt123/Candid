/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.support.v4.app.Fragment
 *  android.support.v4.app.FragmentActivity
 *  android.support.v4.widget.SwipeRefreshLayout
 *  android.support.v4.widget.SwipeRefreshLayout$OnRefreshListener
 *  android.support.v7.widget.LinearLayoutManager
 *  android.support.v7.widget.RecyclerView
 *  android.support.v7.widget.RecyclerView$Adapter
 *  android.support.v7.widget.RecyclerView$ItemAnimator
 *  android.support.v7.widget.RecyclerView$LayoutManager
 *  android.support.v7.widget.RecyclerView$OnScrollListener
 *  android.support.v7.widget.SimpleItemAnimator
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  rx.schedulers.Schedulers
 */
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.becandid.candid.data.MessageThread;
import com.becandid.candid.models.NetworkData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.schedulers.Schedulers;

public class hw
extends Fragment {
    private View a;
    private View b;
    private RecyclerView c;
    private hj d;
    private SwipeRefreshLayout e;

    public void a() {
        if (this.d.d()) {
            this.c.setVisibility(0);
            this.b.setVisibility(8);
            return;
        }
        this.c.setVisibility(8);
        this.b.setVisibility(0);
    }

    public void a(MessageThread messageThread) {
        if (this.d != null) {
            this.d.a(messageThread);
            this.a();
        }
    }

    public void a(final String string2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"thread_page", (Object)string2);
        hashMap.put((Object)"include_messages", (Object)"1");
        ie.a().o((Map<String, String>)hashMap).b(Schedulers.io()).a(apn.a()).b(new apj<NetworkData>(){

            /*
             * Enabled aggressive block sorting
             */
            public void a(NetworkData networkData) {
                if (networkData.threads != null) {
                    if (string2.equals((Object)"0")) {
                        hw.this.a(networkData.threads);
                    } else {
                        hw.this.d.b(networkData.threads);
                    }
                    if (networkData.thread_next_page == 0) {
                        hw.this.d.a((String)null);
                        return;
                    }
                    hw.this.d.a(networkData.thread_next_page);
                }
            }

            @Override
            public void onCompleted() {
                hw.this.e.setRefreshing(false);
                hw.this.a();
            }

            @Override
            public void onError(Throwable throwable) {
                hw.this.e.setRefreshing(false);
                hw.this.a();
                rb.a(throwable);
                Log.d((String)"MessagesThreads", (String)throwable.toString());
            }

            @Override
            public /* synthetic */ void onNext(Object object) {
                this.a((NetworkData)object);
            }
        });
    }

    public void a(List<MessageThread> list) {
        if (this.d != null) {
            this.d.a(list);
        }
        this.e.setRefreshing(false);
    }

    public boolean a(ih.ac ac2) {
        if (this.d != null) {
            return this.d.a(ac2);
        }
        return false;
    }

    public MessageThread b() {
        if (this.d != null) {
            return (MessageThread)this.d.b();
        }
        return null;
    }

    public void b(String string2) {
        if (this.d != null) {
            this.d.a(string2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = layoutInflater.inflate(2130968676, viewGroup, false);
        this.b = this.a.findViewById(2131624457);
        this.c = (RecyclerView)this.a.findViewById(2131624456);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext());
        this.c.setLayoutManager((RecyclerView.LayoutManager)linearLayoutManager);
        this.d = new hj((Context)this.getActivity());
        this.c.setAdapter((RecyclerView.Adapter)this.d);
        this.c.addOnScrollListener((RecyclerView.OnScrollListener)new hl(linearLayoutManager, this.d){

            @Override
            public void onLoadMore(String string2) {
                if (string2 != null) {
                    hw.this.a(string2);
                }
            }
        });
        RecyclerView.ItemAnimator itemAnimator = this.c.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator)itemAnimator).setSupportsChangeAnimations(false);
        }
        this.e = (SwipeRefreshLayout)this.a.findViewById(2131624455);
        this.e.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener(){

            public void onRefresh() {
                hw.this.a("0");
            }
        });
        this.e.post(new Runnable(){

            public void run() {
                hw.this.e.setRefreshing(true);
            }
        });
        return this.a;
    }

}

