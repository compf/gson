package com.google.gson;
public class GsonConfigurationOptions{
    private List<TypeAdapterFactory> factories;

    public List<TypeAdapterFactory> getFactories(){
        return factories;
    }

    public void setFactories(List<TypeAdapterFactory> factories){
        this.factories=factories;
    }

    private com.google.gson.internal.Excluder excluder;

    public com.google.gson.internal.Excluder getExcluder(){
        return excluder;
    }

    public void setExcluder(com.google.gson.internal.Excluder excluder){
        this.excluder=excluder;
    }

    private Map<Type,InstanceCreator<?>> instanceCreators;

    public Map<Type,InstanceCreator<?>> getInstanceCreators(){
        return instanceCreators;
    }

    public void setInstanceCreators(Map<Type,InstanceCreator<?>> instanceCreators){
        this.instanceCreators=instanceCreators;
    }

    private boolean serializeNulls;

    public boolean getSerializeNulls(){
        return serializeNulls;
    }

    public void setSerializeNulls(boolean serializeNulls){
        this.serializeNulls=serializeNulls;
    }

    private boolean complexMapKeySerialization;

    public boolean getComplexMapKeySerialization(){
        return complexMapKeySerialization;
    }

    public void setComplexMapKeySerialization(boolean complexMapKeySerialization){
        this.complexMapKeySerialization=complexMapKeySerialization;
    }

    private boolean generateNonExecutableJson;

    public boolean getGenerateNonExecutableJson(){
        return generateNonExecutableJson;
    }

    public void setGenerateNonExecutableJson(boolean generateNonExecutableJson){
        this.generateNonExecutableJson=generateNonExecutableJson;
    }

    private com.google.gson.FormattingStyle formattingStyle;

    public com.google.gson.FormattingStyle getFormattingStyle(){
        return formattingStyle;
    }

    public void setFormattingStyle(com.google.gson.FormattingStyle formattingStyle){
        this.formattingStyle=formattingStyle;
    }

    private com.google.gson.Strictness strictness;

    public com.google.gson.Strictness getStrictness(){
        return strictness;
    }

    public void setStrictness(com.google.gson.Strictness strictness){
        this.strictness=strictness;
    }

    private boolean serializeSpecialFloatingPointValues;

    public boolean getSerializeSpecialFloatingPointValues(){
        return serializeSpecialFloatingPointValues;
    }

    public void setSerializeSpecialFloatingPointValues(boolean serializeSpecialFloatingPointValues){
        this.serializeSpecialFloatingPointValues=serializeSpecialFloatingPointValues;
    }

    private boolean useJdkUnsafe;

    public boolean getUseJdkUnsafe(){
        return useJdkUnsafe;
    }

    public void setUseJdkUnsafe(boolean useJdkUnsafe){
        this.useJdkUnsafe=useJdkUnsafe;
    }

    private String datePattern;

    public String getDatePattern(){
        return datePattern;
    }

    public void setDatePattern(String datePattern){
        this.datePattern=datePattern;
    }

    private int dateStyle;

    public int getDateStyle(){
        return dateStyle;
    }

    public void setDateStyle(int dateStyle){
        this.dateStyle=dateStyle;
    }

    private int timeStyle;

    public int getTimeStyle(){
        return timeStyle;
    }

    public void setTimeStyle(int timeStyle){
        this.timeStyle=timeStyle;
    }

    private com.google.gson.LongSerializationPolicy longSerializationPolicy;

    public com.google.gson.LongSerializationPolicy getLongSerializationPolicy(){
        return longSerializationPolicy;
    }

    public void setLongSerializationPolicy(com.google.gson.LongSerializationPolicy longSerializationPolicy){
        this.longSerializationPolicy=longSerializationPolicy;
    }

    private com.google.gson.ToNumberStrategy objectToNumberStrategy;

    public com.google.gson.ToNumberStrategy getObjectToNumberStrategy(){
        return objectToNumberStrategy;
    }

    public void setObjectToNumberStrategy(com.google.gson.ToNumberStrategy objectToNumberStrategy){
        this.objectToNumberStrategy=objectToNumberStrategy;
    }

    private com.google.gson.ToNumberStrategy numberToNumberStrategy;

    public com.google.gson.ToNumberStrategy getNumberToNumberStrategy(){
        return numberToNumberStrategy;
    }

    public void setNumberToNumberStrategy(com.google.gson.ToNumberStrategy numberToNumberStrategy){
        this.numberToNumberStrategy=numberToNumberStrategy;
    }

    public GsonConfigurationOptions(List<TypeAdapterFactory> factories,com.google.gson.internal.Excluder excluder,Map<Type,InstanceCreator<?>> instanceCreators,boolean serializeNulls,boolean complexMapKeySerialization,boolean generateNonExecutableJson,com.google.gson.FormattingStyle formattingStyle,com.google.gson.Strictness strictness,boolean serializeSpecialFloatingPointValues,boolean useJdkUnsafe,String datePattern,int dateStyle,int timeStyle,com.google.gson.LongSerializationPolicy longSerializationPolicy,com.google.gson.ToNumberStrategy objectToNumberStrategy,com.google.gson.ToNumberStrategy numberToNumberStrategy){
        this.factories=factories;
        this.excluder=excluder;
        this.instanceCreators=instanceCreators;
        this.serializeNulls=serializeNulls;
        this.complexMapKeySerialization=complexMapKeySerialization;
        this.generateNonExecutableJson=generateNonExecutableJson;
        this.formattingStyle=formattingStyle;
        this.strictness=strictness;
        this.serializeSpecialFloatingPointValues=serializeSpecialFloatingPointValues;
        this.useJdkUnsafe=useJdkUnsafe;
        this.datePattern=datePattern;
        this.dateStyle=dateStyle;
        this.timeStyle=timeStyle;
        this.longSerializationPolicy=longSerializationPolicy;
        this.objectToNumberStrategy=objectToNumberStrategy;
        this.numberToNumberStrategy=numberToNumberStrategy;
    }
}

