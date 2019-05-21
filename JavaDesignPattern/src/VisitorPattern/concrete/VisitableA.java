package VisitorPattern.concrete;

import VisitorPattern.contract.Visitable;
import VisitorPattern.contract.Visitor;

public class VisitableA implements Visitable {

	int numberOfMember;

	public VisitableA(int numberOfMember) {
		this.numberOfMember = numberOfMember;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
