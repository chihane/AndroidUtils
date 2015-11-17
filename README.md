# AndroidUtils

##Integration

    compile 'mlxy.utils:utils:1.0.1'

###L

An encapsulation of **android.util.Log**.

Provides easy access to Log by several exposed methods:

	1. L.v(Object)
	2. L.d(Object)
	3. L.i(Object)
	4. L.w(Object)
	5. L.e(Object)
	6. L.wtf(Object)

###Prefs

Another encapsulation of **android.content.SharedPreferences**.

Used Generic to improve usability:

	1. Prefs.put(Context, String, Object)
	2. Prefs.get(Context, String, ?)

###T

Encapsulated **android.widget.Toast**.

	1. T.showLong(Context, CharSequence)
	2. T.showShort(Context, CharSequence)
	
###IO

Several IO-related APIs.

    1. IO.readStringFromAsset(Context, String)
    
###Device

Device dependent utilities.

    1. Device.dp2px(Context, float)
    
