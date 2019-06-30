package lotto.view.out;

import lotto.domain.LottoWallet;

public class WalletViewer {

	private MessagePrinter printer;

	public WalletViewer(MessagePrinter printer) {
		this.printer = printer;
	}

	public void render(LottoWallet wallet) {
		printer.print("");
		printer.print(wallet.ticketCount() + "개를 구매했습니다.");
		printer.print(wallet.toString());
		printer.print("");
	}
}
