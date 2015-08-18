package com.sidiq.nbs.test.simpledatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Sidiq on 18/08/2015.
 */
public class User extends BaseObservable {
    String firstName, lastName;

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.sidiq.nbs.test.simpledatabinding.BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(com.sidiq.nbs.test.simpledatabinding.BR.lastName);
    }
}
