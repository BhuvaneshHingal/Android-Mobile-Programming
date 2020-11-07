package com.example.restojoint.View.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.restojoint.model.Restaurant

class RestViewModel:ViewModel() {
    val RestoLiveData = MutableLiveData<ArrayList<Restaurant>>()

    fun populatedata(){
        val rest1 = Restaurant("Gokul Brindavan","Coffee House Builiding, W High Ct Rd, Dharampeth, Nagpur, Maharashtra-440010","Masala Dosa", "4.6")
        val rest2 = Restaurant("Veeraswami","LIC Building, Mount Rd, Opp. Ashoka Restaurant, Liberty Chowk, Sadar, Nagpur, Maharashtra-440001","Butter Idli / Filter Coffee", "4.5")
        val rest3 = Restaurant("Haldiram's Planet Food","Plot No. 214, WHC Road, Dharampeth Extension, Near Sudama Talkies, Shankar Nagar, Nagpur, Maharashtra-440010","Haldiram's Special Thali", "4.3")
        val rest4 = Restaurant("Shabana Bakery","Chaoni Chindwada Road Poonam Chamber, Nagpur, Maharashtra-440013","Veg Hot Dog","4")
        val rest5 = Restaurant("Marrakesh","Shop No 1 & 3, Chanakyapuri, Opp, 3, Fergusson College Rd, Ward No. 8, Shivajinagar, Pune, Maharashtra-411004","Shawarma / Rolls","4.1")
        val rest6 = Restaurant("Tea Villa Café","FC Annex Building, Shirole Road, Fergusson College Rd, behind Starbucks Cafe, Pune, Maharashtra-411005","Waffles, Cappuccino, Hot Chocolate, Nachos, Tea","3.7")
        val rest7 = Restaurant("Under The Moon","11/3, Katol Rd, Kalameshwar, Maharashtra-441501","Thali","3.5")
        val rest8 = Restaurant("Amaira","MTDC building MLA Hostel Square Tehsil Office, Civil Lines, Nagpur, Maharashtra-440001","Paneer Shashlik","4.2")

        val restoList = ArrayList<Restaurant>()
        restoList.add(rest1)
        restoList.add(rest2)
        restoList.add(rest3)
        restoList.add(rest4)
        restoList.add(rest5)
        restoList.add(rest6)
        restoList.add(rest7)
        restoList.add(rest8)
        RestoLiveData.postValue(restoList)
    }
}