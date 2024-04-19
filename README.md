# UD8T3-Lambda
#### 1- ¿Cómo podemos saber si podemos usar una expresión lambda para mapearla?
Podremos usarla cuando la interfaz solo tenga un método abstracto
#### ¿Podríamos usar expresiones lambda para mapear métodos de la interfaz List?
No, pues tenemos más de un método abstracto
#### 2- ¿Podríamos entonces usar una expresión lambda para representar una instancia de la interfaz java.util.concurrent.Callable?
Si que podriamos porque tiene solo un método abstracto
#### 3- Se podría crear una expresión lambda de la interfaz java.util.Comparator?
No se podría, tiene 2 métodos abstracto
#### 4- Transforma la siguiente clase anónima en una expresión lambda y crea código de prueba para usarla.
```java
Runnable runnable = new Runnable() {
 @Override
 public void run() {
 String texto = "Vamos a crear un array";
String[] partes = texto.split(" ");
 for (String parte: partes) {
 System.out.println(part);
 }
 }
 };
```
Solución:
```java
Runnable runnable = ()->{ String texto = "Vamos a crear un array";
    String[] partes = texto.split(" "); 
    for (String parte: partes) {
        System.out.println(parte); 
    } 
};
```
#### 5- Transforma en expresión lambda las siguientes clases anónimas
Solución 1:
```java
OperacionUnitariaEntera operacion = (x) ->{ return x+x;
};
```
Solución 2:
```java
OperaciónBinariaDecimal operacion = (valor)-> { return valor*valor;
};
```
Solución 3:
```java
Predicate operacion = (x)-> {return x*5 >100;
};
```
Solución 4:
```java
OperacionBinariaEntera operacion = (x, y)-> { return x+y; };
```
Solución 5:
```java
Saludable sal =()-> "hola mundo";
```
#### 6- Completa el método abstracto el cual determina a la expresión lambda:
1-
```java
@FunctionalInterface
public interface Predicate{
public boolean test(int valor);
}
```

2-  
```java
@FunctionalInterface
public interface UnaryOperator{
public int apply(int valor);
}
```
3-
```java
@FunctionalInterface
public interface Consumer{
    public void accept(int valor);
}
```
4-
```java
@FunctionalInterface
public interface BinaryOperator{
    public int apply(int valor1, int valor2);
}
```
5-
```java
@FunctionalInterface
public interface Predicate{
    public boolean test(int valor);
}

```
#### 7- Transforma el siguiente método en una expresión lambda:
```java
public static String caracteresPares(String texto) {
    StringBuilder sb = new StringBuilder();
    for (int i =0; i<texto.length(); i++){
        if(i % 2 == 0) {
            sb.append(texto.charAt(i));
        }
    }
    return  sb.toString();
}
```
Solución: 
```java
Fuction<String> caracteresPares = (texto) -> {
    StringBuilder sb = new StringBuilder();
    for (int i =0; i<texto.length(); i++){
        if(i % 2 == 0) {
            sb.append(texto.charAt(i));
        }
    }
    return  sb.toString();
};
```
#### 8- Escribe código para ejecutar la función del ejercicio anterior si se le pasa el siguiente texto:”1234567890”
Solución:
```java
Function<Integer, String> caracteresPares = (texto) -> {
    String textoString = texto.toString(); 
    StringBuilder sb = new StringBuilder(); 
    for (int i=0; i < textoString.length(); i++){
        if(i % 2 == 0){ 
            sb.append(textoString.charAt(i)); 
        } 
    } return sb.toString(); 
};
```
#### 9- En relación con el ejercicio anterior, ahora, en vez de ejecutar la función directamente, imagina que quieres pasársela a un método. Escribe un método llamado “paresEjecuta” que acepte la función lambda como parámetro y la ejecute con el texto “1234567890”. Debe devolver el resultado de la función lambda. Llama al método que has creado en el main e imprime el resultado.

```java
import java.util.function.Function;

public static String paresEjecuta(Function<Integer, String> caracteresPares, Integer texto){
    return caracteresPares.apply(texto);
}

public static void main(String[] args) {
    System.out.println(paresEjecuta(caracteresPares, 1234567890));
}
```
#### 10- En relación con el ejercicio anterior, ahora, en vez de ejecutar la función directamente, imagina que quieres pasársela a un método. Escribe un método llamado “paresEjecuta” que acepte la función lambda como parámetro y la ejecute con el texto “1234567890”. Debe devolver el resultado de la función lambda. Llama al método que has creado en el main e imprime el resultado.

```java
import java.util.Arrays;
import java.util.List;

public static void main(String[] args) {
    List<String> ciudades = Arrays.asList("elche", "alicante", "elda", "petrer", "aspe", "crevillente", "alcoy", "ibi", "benidorm", "matola");
    ciudades.sort((c1,c2)->c1.compareTo(c2));
    ciudades.forEach(n-> System.out.println(n.substring(0,1).toUpperCase() + n.substring(1)));
}
```