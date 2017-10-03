package fruitbasket.generic;

/**
 *  定义泛型类
 * Author: FruitBasket
 * Time: 2017年9月27日
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class Set<E> {

	private E element;
	
	public Set(E element){
		this.setElement(element);
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}
}
