# COMANDI PER LA CHAT:
- **/user** <nome_utente> : serve per loggarsi
- **/quit** : serve per disconnettersi
- **/msg** <messaggio_che_si_vuole_inviare> : serve per inviare il messaggio
- **/time** : restituisce l'ora corrente
- **/list** : restituisce la lista degli utenti connessi

# SPIEGAZIONE PROGETTO

Questo è il progetto di una chat realizzata in Java utilizzando il protocollo __TCP__ e i __Socket__.<br>
<br>
Le classi create sono le seguenti:
- MrChatServer
- ThreadChannel
- ChannelsManager
- ChatProtocol
- Command (interfaccia), DefaultMrChatProtocol
- JMrClient, Main
# Classe _MrChatServer_
La seguente classe si occupa di stare in ascolto sulla porta 10000 (nel nostro caso).<br>
Infatti ho utilizzato la classe __ServerSocket__;<br>
quando riceve una connessione, essa la delega all'oggetto __Channelsmanager__.
# Classe _ThreadChannel_
La seguente classe estende la classe __Thread__.<br>
Questa classe conosce il suo "utente" perché viene definito nell'istanza dell'oggetto **ChannelsManager**.
# Classe _Channelsmanager_
Questa classe è una specie di contenitore:
vengono mantenuti tutti i riferimenti dei diversi **ThreadChannel** relativi ai client (user) che sono loggati alla chat.<br>
Questa classe, inoltre, provvede ad inizializzare il Socket afiidandolo as un ThreadChannel, e fa da tramite tra il protocollo ed il resto del server.<br>
Finché l'utente non si logga, i suoi messaggi non verranno inviati e quindi visualizzati dagli altri utenti collegati.
# Classe astratta _ChatProtocol_
Inizio col dire che è astratta per il semplice fatto che così non va ad apportare nessuna modifica alla struttura del server.<br>
Inoltre, qui implementiamo i protocolli.
# Interfaccia _Command_, classe _DefaultMrChatProtocol_
(è quella che preferisco)<br>
Qui abbiamo creato un **nostro** protocollo, ovvero, abbiamo stabilito delle regole per collegarsi, scrivere un messaggio, uscire dalla chat, vedere l'orario e vedere la lista degli utenti collegati (i comandi sono scritti ad inizio documento).<br>
# classi Main e JMrClient
Infine abbiamo le due classi che fanno avviare il server (Main) e l'interfaccia grafica del client (JMrClient).<br>

