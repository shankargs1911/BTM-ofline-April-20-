package com.xworkz.dto;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.constant.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO implements List<CarDTO> {
	private Integer Cid;
	private String name;
	private Model model =Model.DEFAULT;
	private Integer speed;
	private String registra;
	@Override
	public int size() {
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<CarDTO> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(CarDTO e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(Collection<? extends CarDTO> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int index, Collection<? extends CarDTO> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public CarDTO get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CarDTO set(int index, CarDTO element) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int index, CarDTO element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public CarDTO remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<CarDTO> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<CarDTO> listIterator(int index) {
		return null;
	}
	@Override
	public List<CarDTO> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
