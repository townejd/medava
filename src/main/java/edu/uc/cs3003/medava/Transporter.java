package edu.uc.cs3003.medava;
import java.util.List;
import java.util.ArrayList;
// import java.lang.reflect.InvocationTargetException;
// import java.lang.reflect.Method;

public class Transporter {
    private String mTransporterName;

    private double mLowTemperature, mHighTemperature;
    
    private List<Shippable> goods;
    
    {
        goods = new ArrayList<Shippable>();
    }
    
    public String getTransporterName(){
        return mTransporterName;
    }
    
    public void ship(){
        // Do some shipping!
    }
    
    public Transporter(String transporterName, double lowTemp, double highTemp){
        mTransporterName = transporterName;
        mLowTemperature = lowTemp;
        mHighTemperature = highTemp;
    }

    public Shippable unload() {
        return goods.remove(0);
    }

    public boolean load(Shippable itemToLoad) {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            return goods.add(itemToLoad);
        }
        return false;
    }
    
    // public boolean load(Object itemToLoad) {
    //     try {
    //         Method isTemperatureRangeAcceptableMethod = itemToLoad.getClass().getMethod("isTemperatureRangeAcceptable",
    //                 Double.class, Double.class);
    //         boolean resultOfMethodCall = (boolean) isTemperatureRangeAcceptableMethod.invoke(itemToLoad,
    //                 Double.valueOf(mLowTemperature), Double.valueOf(mHighTemperature));
    //         if (resultOfMethodCall) {
    //             goods.add(itemToLoad);
    //         }
    //         return resultOfMethodCall;
    //     } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
    //             | InvocationTargetException e) {
    //         return false;
    //     }
    // }
    
    // public Object unload(){
    //     return goods.remove(0);
    // }
    
    public boolean isEmpty(){
        return goods.isEmpty();
    }
}