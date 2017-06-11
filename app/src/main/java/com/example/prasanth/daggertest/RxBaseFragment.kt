package com.example.prasanth.daggertest

/**
 * Created by Prasanth on 6/11/2017.
 */

import android.support.v4.app.Fragment
import rx.subscriptions.CompositeSubscription

open class RxBaseFragment() : Fragment() {
    
        protected var subscriptions = CompositeSubscription()
    
        override fun onResume() {
                super.onResume()
                subscriptions = CompositeSubscription()
            }
    
        override fun onPause() {
                super.onPause()
                if (!subscriptions.isUnsubscribed) {
                        subscriptions.unsubscribe()
                    }
                subscriptions.clear()
            }
    }
