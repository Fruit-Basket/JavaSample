package fruitbasket.generic;

/**
 *  ���巺����
 * Author: FruitBasket
 * Time: 2017��9��27��
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
