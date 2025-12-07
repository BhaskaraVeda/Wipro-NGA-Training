package com.wipro.collectionsdemo;

public class IncrementValue<E> {   // Generic Entity
  E x;
  
  IncrementValue(E a)
  {
	  x=a;
  }
	
     E increment()
     {
    	 
    	 return x; 
     }
  
}


/*
 *                  <Child2 extends Parent>
 * Upper bound      <? extends Clasname>    or   <? implements Interface>
 * 
 *                      <Shape super Rectangle,Circle,Square>
 * lower bound          <? super Classname>
 * 
 * 
 * unbounded  <?>
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

















