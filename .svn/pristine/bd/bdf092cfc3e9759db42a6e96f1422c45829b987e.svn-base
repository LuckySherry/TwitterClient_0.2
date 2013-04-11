package test.hk.ust.cse.TwitterClient.Mocks;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import twitter4j.PagableResponseList;
import twitter4j.RateLimitStatus;
import twitter4j.User;
import test.hk.ust.cse.TwitterClient.Mocks.MockUser;


@SuppressWarnings("serial")
public class MockPagableResponseList<MockUser> implements PagableResponseList<User>{
	List<MockUser> m_list;
	public MockPagableResponseList () {
		m_list = new ArrayList<MockUser>();
	}
	
	@Override
	public RateLimitStatus getRateLimitStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAccessLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean add(User arg0) {
		// TODO Auto-generated method stub
		m_list.add((MockUser) arg0);
		return true;
	}

	@Override
	public void add(int arg0, User arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends User> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends User> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User get(int arg0) {
		// TODO Auto-generated method stub
		return (User)m_list.get(arg0);
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return m_list.indexOf(arg0);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<User> iterator() {
		// TODO Auto-generated method stub
		return (Iterator<User>) m_list.iterator();
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<User> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<User> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User set(int arg0, User arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return m_list.toArray(arg0);
	}

	@Override
	public long getNextCursor() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public long getPreviousCursor() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

}
