package www.revengerfitness.blogspot.com.viewmodelfactoryjetpack


import androidx.lifecycle.ViewModel

class MainViewModel(val initialValue:Int):ViewModel() { // model classes are independent of views.only used to handle with data.do not hold reference of any view in this class because it will create memory leaks.

     var count: Int = initialValue

    fun increment() {
        count++

    }
}