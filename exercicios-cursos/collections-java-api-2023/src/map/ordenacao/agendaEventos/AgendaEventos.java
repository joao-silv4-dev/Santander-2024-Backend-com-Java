import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}

	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		if (nome != null && !nome.isEmpty() && atracao != null && !atracao.isEmpty()) {
			Evento evento = new Evento(nome, atracao);
			eventosMap.put(data, evento);
		}
	}

	public Map<LocalDate, Evento> exibirAgenda() {
		if (!this.eventosMap.isEmpty()) {
			Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(this.eventosMap);
			return agendaOrdenada;
		}
		return null;
	}

	public void obterProximoEvento() {
		if (!this.eventosMap.isEmpty()) {
			LocalDate dataAtual = LocalDate.now();
			LocalDate proxData = LocalDate.of(999999999, 12, 31);
			Evento proximoEvento = new Evento(null, null);
			for (LocalDate key : this.eventosMap.keySet()) {
				if ((key.isAfter(dataAtual)||key==dataAtual) && key.isBefore(proxData)) {
					proxData = key;
					proximoEvento = this.eventosMap.get(key);
				}
			}
			if (proximoEvento==new Evento(null, null)){
				System.out.println("Nenhum evento encontrado!");
			} else System.out.println("Proximo evento" + System.lineSeparator() + proximoEvento);
		}
	}
}