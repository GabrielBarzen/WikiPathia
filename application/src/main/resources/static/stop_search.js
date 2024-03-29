
let host = "http://localhost:8080";
let arr = ["default value"];
let origin;
let destination;

let article = {"parse":{"title":"Malmö universitet","pageid":89540,"text":"<div class=\"mw-parser-output\"><style data-mw-deduplicate=\"TemplateStyles:r49119531\">.mw-parser-output .infobox{border:1px solid #aaa;background-color:#f9f9f9;color:black;margin:.5em 0 .5em 1em;padding:.2em;float:right;clear:right;width:22em;text-align:left;font-size:88%;line-height:1.6em}.mw-parser-output .infobox td,.mw-parser-output .infobox th{vertical-align:top;padding:0 .2em}.mw-parser-output .infobox caption{font-size:larger}.mw-parser-output .infobox.bordered{border-collapse:collapse}.mw-parser-output .infobox.bordered td,.mw-parser-output .infobox.bordered th{border:1px solid #aaa}.mw-parser-output .infobox.bordered .borderless td,.mw-parser-output .infobox.bordered .borderless th{border:0}.mw-parser-output .infobox-showbutton .mw-collapsible-text{color:inherit}.mw-parser-output .infobox.bordered .mergedtoprow td,.mw-parser-output .infobox.bordered .mergedtoprow th{border:0;border-top:1px solid #aaa;border-right:1px solid #aaa}.mw-parser-output .infobox.bordered .mergedrow td,.mw-parser-output .infobox.bordered .mergedrow th{border:0;border-right:1px solid #aaa}.mw-parser-output .infobox.geography{border:1px solid #ccd2d9;text-align:left;border-collapse:collapse;line-height:1.2em;font-size:90%}.mw-parser-output .infobox.geography td,.mw-parser-output .infobox.geography th{border-top:solid 1px #ccd2d9;padding:0.4em 0.6em 0.4em 0.6em}.mw-parser-output .infobox.geography .mergedtoprow td,.mw-parser-output .infobox.geography .mergedtoprow th{border-top:solid 1px #ccd2d9;padding:0.4em 0.6em 0.2em 0.6em}.mw-parser-output .infobox.geography .mergedrow td,.mw-parser-output .infobox.geography .mergedrow th{border:0;padding:0 0.6em 0.2em 0.6em}.mw-parser-output .infobox.geography .mergedbottomrow td,.mw-parser-output .infobox.geography .mergedbottomrow th{border-top:0;border-bottom:solid 1px #ccd2d9;padding:0 0.6em 0.4em 0.6em}.mw-parser-output .infobox.geography .maptable td,.mw-parser-output .infobox.geography .maptable th{border:0;padding:0}</style><table class=\"infobox vcard\" style=\"border-spacing:3px;\"><tbody><tr><td colspan=\"2\" class=\"fn org\" style=\"padding:2px; text-align:center; font-size: 125%; font-weight: bold;\">Malmö universitet</td></tr><tr><td colspan=\"2\" class=\"\" style=\"text-align:center;\"> <a href=\"/wiki/Fil:Malm%C3%B6_universitets_logotyp_(cropped).png\" class=\"image\"><img alt=\"\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/d/de/Malm%C3%B6_universitets_logotyp_%28cropped%29.png/250px-Malm%C3%B6_universitets_logotyp_%28cropped%29.png\" decoding=\"async\" width=\"250\" height=\"261\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/d/de/Malm%C3%B6_universitets_logotyp_%28cropped%29.png/375px-Malm%C3%B6_universitets_logotyp_%28cropped%29.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/d/de/Malm%C3%B6_universitets_logotyp_%28cropped%29.png/500px-Malm%C3%B6_universitets_logotyp_%28cropped%29.png 2x\" data-file-width=\"854\" data-file-height=\"893\" /></a> <div style=\"\">Malmö universitets logotyp utan texten under</div></td></tr><tr><td colspan=\"2\" class=\"\" style=\"text-align:center;\"><a href=\"/wiki/Engelska\" title=\"Engelska\">Engelska</a>: <i>Malmö university</i></td></tr><tr><th style=\"text-align:left;\">Motto</th><td class=\"\" style=\"\">Där mångfald gör skillnad</td></tr><tr><th style=\"text-align:left;\">Grundat</th><td class=\"\" style=\"\"><a href=\"/wiki/1_juli\" title=\"1 juli\">1 juli</a> <a href=\"/wiki/1998\" title=\"1998\">1998</a> <small>(högskola)</small><br /><a href=\"/wiki/1_januari\" title=\"1 januari\">1 januari</a> <a href=\"/wiki/2018\" title=\"2018\">2018</a> <small>(universitet)</small></td></tr><tr><th style=\"text-align:left;\">Ägandeform</th><td class=\"\" style=\"\"><a href=\"/wiki/Sveriges_myndigheter\" title=\"Sveriges myndigheter\">Statlig myndighet</a></td></tr><tr><th style=\"text-align:left;\">Rektor</th><td class=\"\" style=\"\"><a href=\"/wiki/Kerstin_Tham\" title=\"Kerstin Tham\">Kerstin Tham</a></td></tr><tr><th style=\"text-align:left;\">Lärarkår</th><td class=\"\" style=\"\">Lärare, forskare och anställda doktorander: 2093 (2020) <sup id=\"cite_ref-om_1-0\" class=\"reference\"><a href=\"#cite_note-om-1\"><span class=\"cite-reference-link-bracket\">[</span>1<span class=\"cite-reference-link-bracket\">]</span></a></sup></td></tr><tr><th style=\"text-align:left;\">Studerande</th><td class=\"\" style=\"\">24 000 <a href=\"/wiki/Hel%C3%A5rsstudent_och_hel%C3%A5rsprestation\" title=\"Helårsstudent och helårsprestation\">helårsstudenter</a> (2020) <sup id=\"cite_ref-om_1-1\" class=\"reference\"><a href=\"#cite_note-om-1\"><span class=\"cite-reference-link-bracket\">[</span>1<span class=\"cite-reference-link-bracket\">]</span></a></sup></td></tr><tr><th style=\"text-align:left;\"><a href=\"/wiki/Doktorand\" title=\"Doktorand\">Doktorander</a></th><td class=\"\" style=\"\">264 <sup id=\"cite_ref-om_1-2\" class=\"reference\"><a href=\"#cite_note-om-1\"><span class=\"cite-reference-link-bracket\">[</span>1<span class=\"cite-reference-link-bracket\">]</span></a></sup></td></tr><tr><th style=\"text-align:left;\">Säte</th><td class=\"adr\" style=\"\"><span class=\"locality\"><span class=\"flagicon\"><a href=\"/wiki/Sverige\" title=\"Sverige\"><img alt=\"Sverige\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Flag_of_Sweden.svg/22px-Flag_of_Sweden.svg.png\" decoding=\"async\" width=\"22\" height=\"14\" class=\"thumbborder\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Flag_of_Sweden.svg/33px-Flag_of_Sweden.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Flag_of_Sweden.svg/44px-Flag_of_Sweden.svg.png 2x\" data-file-width=\"512\" data-file-height=\"320\" /></a></span> <a href=\"/wiki/Malm%C3%B6\" title=\"Malmö\">Malmö</a></span>, <span class=\"country-name\"><a href=\"/wiki/Sverige\" title=\"Sverige\">Sverige</a></span></td></tr><tr><th style=\"text-align:left;\">Färger</th><td class=\"\" style=\"\">Röd<br /><span style=\"background-color:#FF0000; color:; border:1px solid #aaa; text-align:center;\">&#160;&#160;&#160;&#160;</span></td></tr><tr><th style=\"text-align:left;\">Webbplats</th><td class=\"\" style=\"\"><a rel=\"nofollow\" class=\"external text\" href=\"https://www.mau.se/\">www.mau.se</a></td></tr></tbody></table>\n<p><span></span>\n<b>Malmö universitet</b>, tidigare <b>Malmö högskola</b>, är ett svenskt statligt universitet i <a href=\"/wiki/Malm%C3%B6\" title=\"Malmö\">Malmö</a>. Det grundades 1998 som Malmö högskola och har ungefär 24 000 inskrivna studenter<sup id=\"cite_ref-2\" class=\"reference\"><a href=\"#cite_note-2\"><span class=\"cite-reference-link-bracket\">[</span>2<span class=\"cite-reference-link-bracket\">]</span></a></sup>, 200 doktorander och omkring 1 400 anställda<sup id=\"cite_ref-3\" class=\"reference\"><a href=\"#cite_note-3\"><span class=\"cite-reference-link-bracket\">[</span>3<span class=\"cite-reference-link-bracket\">]</span></a></sup>, varav ett 60-tal är professorer. <a href=\"/wiki/Kerstin_Tham\" title=\"Kerstin Tham\">Kerstin Tham</a> är rektor sedan 1 november 2015.<sup id=\"cite_ref-4\" class=\"reference\"><a href=\"#cite_note-4\"><span class=\"cite-reference-link-bracket\">[</span>4<span class=\"cite-reference-link-bracket\">]</span></a></sup>\n</p><p>En stor del av utbildningen är lokaliserad till <a href=\"/wiki/Universitetsholmen\" title=\"Universitetsholmen\">Universitetsholmen</a>. Huvudbiblioteket ligger i byggnaden <a href=\"/wiki/Orkanen_(byggnad)\" title=\"Orkanen (byggnad)\">Orkanen</a>, där också fakulteten för lärande och samhälle finns.\n</p>\n<div id=\"toc\" class=\"toc\" role=\"navigation\" aria-labelledby=\"mw-toc-heading\"><input type=\"checkbox\" role=\"button\" id=\"toctogglecheckbox\" class=\"toctogglecheckbox\" style=\"display:none\" /><div class=\"toctitle\" lang=\"sv\" dir=\"ltr\"><h2 id=\"mw-toc-heading\">Innehåll</h2><span class=\"toctogglespan\"><label class=\"toctogglelabel\" for=\"toctogglecheckbox\"></label></span></div>\n<ul>\n<li class=\"toclevel-1 tocsection-1\"><a href=\"#Historik\"><span class=\"tocnumber\">1</span> <span class=\"toctext\">Historik</span></a></li>\n<li class=\"toclevel-1 tocsection-2\"><a href=\"#Fakulteter\"><span class=\"tocnumber\">2</span> <span class=\"toctext\">Fakulteter</span></a></li>\n<li class=\"toclevel-1 tocsection-3\"><a href=\"#Forskning\"><span class=\"tocnumber\">3</span> <span class=\"toctext\">Forskning</span></a></li>\n<li class=\"toclevel-1 tocsection-4\"><a href=\"#Byggnader\"><span class=\"tocnumber\">4</span> <span class=\"toctext\">Byggnader</span></a></li>\n<li class=\"toclevel-1 tocsection-5\"><a href=\"#Bildgalleri\"><span class=\"tocnumber\">5</span> <span class=\"toctext\">Bildgalleri</span></a></li>\n<li class=\"toclevel-1 tocsection-6\"><a href=\"#Internationella_utbyten\"><span class=\"tocnumber\">6</span> <span class=\"toctext\">Internationella utbyten</span></a></li>\n<li class=\"toclevel-1 tocsection-7\"><a href=\"#Personer_som_varit_anställda_eller_studerat_på_Malmö_universitet\"><span class=\"tocnumber\">7</span> <span class=\"toctext\">Personer som varit anställda eller studerat på Malmö universitet</span></a></li>\n<li class=\"toclevel-1 tocsection-8\"><a href=\"#Rektorer\"><span class=\"tocnumber\">8</span> <span class=\"toctext\">Rektorer</span></a></li>\n<li class=\"toclevel-1 tocsection-9\"><a href=\"#Källor\"><span class=\"tocnumber\">9</span> <span class=\"toctext\">Källor</span></a>\n<ul>\n<li class=\"toclevel-2 tocsection-10\"><a href=\"#Noter\"><span class=\"tocnumber\">9.1</span> <span class=\"toctext\">Noter</span></a></li>\n</ul>\n</li>\n<li class=\"toclevel-1 tocsection-11\"><a href=\"#Externa_länkar\"><span class=\"tocnumber\">10</span> <span class=\"toctext\">Externa länkar</span></a></li>\n</ul>\n</div>\n\n<h2><span class=\"mw-headline\" id=\"Historik\">Historik</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;veaction=edit&amp;section=1\" class=\"mw-editsection-visualeditor\" title=\"Redigera avsnitt: Historik\">redigera</a><span class=\"mw-editsection-divider\"> | </span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;action=edit&amp;section=1\" title=\"Redigera avsnitt: Historik\">redigera wikitext</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n<p>Malmö högskola bildades 1 juli 1998 med högskoleutbildningar som redan tidigare fanns i Malmö och som tillhört <a href=\"/wiki/Lunds_universitet\" title=\"Lunds universitet\">Lunds universitet</a> eller <a href=\"/wiki/Malm%C3%B6_kommun\" title=\"Malmö kommun\">Malmö kommun</a> som bas, bland andra tandläkar-, lärar- och sjuksköterskeutbildningar. Vid bildandet hade högskolan omkring 5 000 inskrivna studenter.\n</p><p>Odontologiska fakulteten grundades 1948 som den självständiga <a href=\"/wiki/Tandl%C3%A4karh%C3%B6gskolan_i_Malm%C3%B6\" class=\"mw-redirect\" title=\"Tandläkarhögskolan i Malmö\">Tandläkarhögskolan i Malmö</a> och var då den första akademiska utbildningen i Malmö. År 1964 uppgick högskolan i Lunds universitet som dess odontologiska fakultet, men fortsatte att finnas i samma lokaler i Malmö.\n</p><p><a href=\"/wiki/L%C3%A4rarh%C3%B6gskolan_i_Malm%C3%B6\" title=\"Lärarhögskolan i Malmö\">Lärarhögskolan i Malmö</a> bildades 1960 och uppgick i Lunds universitet 1977.\n</p><p>Vårdhögskolan i Malmö tillhörde Malmö kommun fram till bildandet av Malmö högskola, eftersom kommunen stod utanför landstinget i <a href=\"/wiki/Malm%C3%B6hus_l%C3%A4n\" title=\"Malmöhus län\">Malmöhus län</a> och hade en egen vårdorganisation.<sup id=\"cite_ref-5\" class=\"reference\"><a href=\"#cite_note-5\"><span class=\"cite-reference-link-bracket\">[</span>5<span class=\"cite-reference-link-bracket\">]</span></a></sup>\n</p><p>Högskolan fick ställning som universitet den 1 januari 2018.<sup id=\"cite_ref-6\" class=\"reference\"><a href=\"#cite_note-6\"><span class=\"cite-reference-link-bracket\">[</span>6<span class=\"cite-reference-link-bracket\">]</span></a></sup><sup id=\"cite_ref-7\" class=\"reference\"><a href=\"#cite_note-7\"><span class=\"cite-reference-link-bracket\">[</span>7<span class=\"cite-reference-link-bracket\">]</span></a></sup>\n</p>\n<h2><span class=\"mw-headline\" id=\"Fakulteter\">Fakulteter</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;veaction=edit&amp;section=2\" class=\"mw-editsection-visualeditor\" title=\"Redigera avsnitt: Fakulteter\">redigera</a><span class=\"mw-editsection-divider\"> | </span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;action=edit&amp;section=2\" title=\"Redigera avsnitt: Fakulteter\">redigera wikitext</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n<ul><li>Fakulteten för teknik och samhälle är placerad i huset <a href=\"/wiki/Niagara_(byggnad)\" title=\"Niagara (byggnad)\">Niagara</a> nära <a href=\"/wiki/Anna_Lindhs_plats,_Malm%C3%B6\" title=\"Anna Lindhs plats, Malmö\">Anna Lindhs plats i Malmö</a>. Fakulteten har ca 3 000 studenter och 100 anställda. Inom fakulteten finns institutionerna Datavetenskap och Medieteknik och produktutveckling. Fakulteten har utbildning och forskning inom informationsarkitektur, spelutveckling, medieteknik och design.</li></ul>\n<ul><li>Fakulteten för lärande och samhälle är placerad i huset <a href=\"/wiki/Orkanen_(byggnad)\" title=\"Orkanen (byggnad)\">Orkanen</a> på Nordenskiöldsgatan 10 i Malmö. Fakulteten har cirka 5000 studenter och är en av Sveriges största lärarutbildningar. Inom fakulteten finns institutionerna Barn-unga-samhälle, Idrottsvetenskap, Individ och samhälle, Kultur-språk-medier, Natur-miljö-samhälle, Skolutveckling och ledarskap.</li></ul>\n<ul><li>Fakulteten för kultur och samhälle finns i byggnaden <a href=\"/wiki/G%C3%A4ddan_8\" title=\"Gäddan 8\">Gäddan 8</a> på Citadellsvägen 7, samt tillsammans med Fakulteten för teknik och samhälle i byggnaden <a href=\"/wiki/Niagara_(byggnad)\" title=\"Niagara (byggnad)\">Niagara</a>. Fakulteten har 5000 studenter och ca 300 anställda. Inom fakulteten finns institutionerna Globala politiska studier, Konst, kultur och kommunikation, Urbana studier och Språkstudier.</li></ul>\n<ul><li>Fakulteten för hälsa och samhälle är till stor del placerad på sjukhusområdet i Malmö. Inom fakulteten finns institutionerna Biomedicinsk vetenskap, Hälso- och välfärdsstudier, Kriminologi, Socialt arbete, Vårdvetenskap. Fakulteten har utbildning och forskning inom bland annat biomedicinsk vetenskap, omvårdnad och vårdvetenskap, kriminologi, sexologi, socialt arbete samt på välfärdsområdet.</li></ul>\n<ul><li>Odontologiska fakulteten, <a href=\"/wiki/Tandv%C3%A5rdsh%C3%B6gskolan\" title=\"Tandvårdshögskolan\">Tandvårdshögskolan</a>, ligger intill <a href=\"/wiki/Station_Triangeln\" class=\"mw-redirect\" title=\"Station Triangeln\">station Triangeln</a> i Malmö. Fakulteten utbildar till tandläkare, tandhygienist och tandtekniker och har forskning inom biologiska gränsytor, materialvetenskap och  oral hälsa.</li></ul>\n<h2><span class=\"mw-headline\" id=\"Forskning\">Forskning</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;veaction=edit&amp;section=3\" class=\"mw-editsection-visualeditor\" title=\"Redigera avsnitt: Forskning\">redigera</a><span class=\"mw-editsection-divider\"> | </span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;action=edit&amp;section=3\" title=\"Redigera avsnitt: Forskning\">redigera wikitext</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n<p>Forskningen vid Malmö universitet spänner över en stor del av det vetenskapliga spektrumet men med tyngdpunkt på samhällsvetenskaplig och medicinsk forskning. Bland annat bedrivs forskning inom klinisk odontologi, hälsa, vård och välfärd, biofilmer och biologiska gränsytor, datavetenskap, utbildningsvetenskap, urbana studier, migration och idrottsvetenskap. Malmö universitet har utbildning på forskarnivå inom 15 forskarutbildningsämnen. \n</p><p>Fakulteten för hälsa och samhälle bedriver forskning inom biomedicinsk vetenskap, omvårdnad och vårdvetenskap, kriminologi, sexologi, socialt arbete samt på välfärdsområdet.\n</p><p>Fakulteten för lärande och samhälle bedriver forskning inom två områden: Idrott i förändring har en samhällsvetenskaplig och humanistisk profil. Utgångspunkten är att samhällsaspekter som genus, social klass och kulturell mångfald alltid påverkar idrotten, samtidigt som idrotten utövar ett inflytande på samhället. Området Utbildningsvetenskap är flervetenskapligt och kretsar bland annat kring utbildningssystemets organisation, ämnesdidaktik i olika utbildningar och barns och ungdomars livsvillkor.\n</p><p>Fakulteten för kultur och samhälle bedriver utbildning och forskning inom humaniora, samhällsvetenskap, teknik och design. Forskningsämnen är bland annat urbana studier och hållbar stadsutveckling, migration, global politik, internationell fred och säkerhet, nya medier, interaktionsdesign, litteraturvetenskap, språk och genus.\n</p><p>Forskningen på Fakulteten för teknik och samhälle bedrivs i samverkan med företag, myndigheter och andra organisationer inom områden som materialvetenskap, datavetenskap, tillämpad matematik, medieteknik och fysik.\n</p><p>Odontologiska fakulteten bedriver utbildning och forskning inom odontologi. Forskningen är indelad i sex forskningsmiljöer: det orala ekosystemet med inriktning mot gränsytor, <a href=\"/w/index.php?title=Orofaciala_funktionsst%C3%B6rningar&amp;action=edit&amp;redlink=1\" class=\"new\" title=\"Orofaciala funktionsstörningar [inte skriven än]\">orofaciala funktionsstörningar</a> och smärta, biomaterial och rekonstruktiv tandvård, diagnostik och progniosticering, oral folkhälsa samt <a href=\"/wiki/Profession\" title=\"Profession\">professionsforskning</a>.\n</p>\n<h2><span class=\"mw-headline\" id=\"Byggnader\">Byggnader</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;veaction=edit&amp;section=4\" class=\"mw-editsection-visualeditor\" title=\"Redigera avsnitt: Byggnader\">redigera</a><span class=\"mw-editsection-divider\"> | </span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;action=edit&amp;section=4\" title=\"Redigera avsnitt: Byggnader\">redigera wikitext</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n<p>Malmö univetsitets verksamhet finns i åtta byggnader, bland andra:\n</p>\n<ul><li><i><a href=\"/wiki/Orkanen_(byggnad)\" title=\"Orkanen (byggnad)\">Orkanen</a></i> på Nordenskiöldsgatan, med fakulteten för lärande och samhälle (sedan 2005).</li>\n<li><i><a href=\"/wiki/Niagara_(byggnad)\" title=\"Niagara (byggnad)\">Niagara</a> på Nordenskiöldsgatan nära <a href=\"/wiki/Anna_Lindhs_plats,_Malm%C3%B6\" title=\"Anna Lindhs plats, Malmö\">Anna Lindhs plats, Malmö</a>, med fakulteten för kultur och samhälle och fakulteten för teknik och samhälle (sedan 2015). </i></li>\n<li><i><a href=\"/wiki/G%C3%A4ddan_8\" title=\"Gäddan 8\">Gäddan 8</a></i> på <i>Citadellsvägen</i> nära <i><a href=\"/wiki/Niagara_(byggnad)\" title=\"Niagara (byggnad)\">Niagara</a></i> och mittemot <i><a href=\"/wiki/Hovr%C3%A4tten_%C3%B6ver_Sk%C3%A5ne_och_Blekinge\" title=\"Hovrätten över Skåne och Blekinge\">Hovrätten över Skåne och Blekinge</a></i>, med <i>fakulteten för hälsa och samhälle och institutionen för socialt arbete</i>.</li>\n<li><i><a href=\"/wiki/Allm%C3%A4nna_sjukhuset_AS9\" title=\"Allmänna sjukhuset AS9\">Allmänna sjukhuset AS9</a></i> (<i>AS9</i>) på <i>Jan Waldenströms gata</i>, med <i>fakulteten för hälsa och samhälle</i>.</li></ul>\n<h2><span class=\"mw-headline\" id=\"Bildgalleri\">Bildgalleri</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;veaction=edit&amp;section=5\" class=\"mw-editsection-visualeditor\" title=\"Redigera avsnitt: Bildgalleri\">redigera</a><span class=\"mw-editsection-divider\"> | </span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;action=edit&amp;section=5\" title=\"Redigera avsnitt: Bildgalleri\">redigera wikitext</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n<ul class=\"gallery mw-gallery-traditional\">\n\t\t<li class=\"gallerybox\" style=\"width: 185px\"><div style=\"width: 185px\">\n\t\t\t<div class=\"thumb\" style=\"width: 180px;\"><div style=\"margin:35px auto;\"><a href=\"/wiki/Fil:Outside_Orkanen,_Malm%C3%B6_University.jpg\" class=\"image\"><img alt=\"\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Outside_Orkanen%2C_Malm%C3%B6_University.jpg/150px-Outside_Orkanen%2C_Malm%C3%B6_University.jpg\" decoding=\"async\" width=\"150\" height=\"110\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Outside_Orkanen%2C_Malm%C3%B6_University.jpg/225px-Outside_Orkanen%2C_Malm%C3%B6_University.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Outside_Orkanen%2C_Malm%C3%B6_University.jpg/300px-Outside_Orkanen%2C_Malm%C3%B6_University.jpg 2x\" data-file-width=\"4183\" data-file-height=\"3077\" /></a></div></div>\n\t\t\t<div class=\"gallerytext\">\n<p><a href=\"/wiki/Hj%C3%A4lmarekajen\" title=\"Hjälmarekajen\">Hjälmarekajen</a>\n</p>\n\t\t\t</div>\n\t\t</div></li>\n\t\t<li class=\"gallerybox\" style=\"width: 185px\"><div style=\"width: 185px\">\n\t\t\t<div class=\"thumb\" style=\"width: 180px;\"><div style=\"margin:40.5px auto;\"><a href=\"/wiki/Fil:Outside_Student_Centre,_Malm%C3%B6_University.jpg\" class=\"image\"><img alt=\"\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Outside_Student_Centre%2C_Malm%C3%B6_University.jpg/150px-Outside_Student_Centre%2C_Malm%C3%B6_University.jpg\" decoding=\"async\" width=\"150\" height=\"99\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Outside_Student_Centre%2C_Malm%C3%B6_University.jpg/225px-Outside_Student_Centre%2C_Malm%C3%B6_University.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Outside_Student_Centre%2C_Malm%C3%B6_University.jpg/300px-Outside_Student_Centre%2C_Malm%C3%B6_University.jpg 2x\" data-file-width=\"4804\" data-file-height=\"3181\" /></a></div></div>\n\t\t\t<div class=\"gallerytext\">\n<p><a href=\"/wiki/Universitetsholmen\" title=\"Universitetsholmen\">Universitetsholmen</a>\n</p>\n\t\t\t</div>\n\t\t</div></li>\n\t\t<li class=\"gallerybox\" style=\"width: 185px\"><div style=\"width: 185px\">\n\t\t\t<div class=\"thumb\" style=\"width: 180px;\"><div style=\"margin:40px auto;\"><a href=\"/wiki/Fil:Faculty_Health_and_Society,_Malm%C3%B6_University.jpg\" class=\"image\"><img alt=\"\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Faculty_Health_and_Society%2C_Malm%C3%B6_University.jpg/150px-Faculty_Health_and_Society%2C_Malm%C3%B6_University.jpg\" decoding=\"async\" width=\"150\" height=\"100\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Faculty_Health_and_Society%2C_Malm%C3%B6_University.jpg/225px-Faculty_Health_and_Society%2C_Malm%C3%B6_University.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Faculty_Health_and_Society%2C_Malm%C3%B6_University.jpg/300px-Faculty_Health_and_Society%2C_Malm%C3%B6_University.jpg 2x\" data-file-width=\"800\" data-file-height=\"533\" /></a></div></div>\n\t\t\t<div class=\"gallerytext\">\n<p><a href=\"/wiki/Allm%C3%A4nna_sjukhuset_AS9\" title=\"Allmänna sjukhuset AS9\">Allmänna sjukhuset AS9</a> som huserar fakulteten för hälsa och samhälle.\n</p>\n\t\t\t</div>\n\t\t</div></li>\n\t\t<li class=\"gallerybox\" style=\"width: 185px\"><div style=\"width: 185px\">\n\t\t\t<div class=\"thumb\" style=\"width: 180px;\"><div style=\"margin:40.5px auto;\"><a href=\"/wiki/Fil:Malm%C3%B6_h%C3%B6gskola_bibliotek_02.JPG\" class=\"image\"><img alt=\"\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Malm%C3%B6_h%C3%B6gskola_bibliotek_02.JPG/150px-Malm%C3%B6_h%C3%B6gskola_bibliotek_02.JPG\" decoding=\"async\" width=\"150\" height=\"99\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Malm%C3%B6_h%C3%B6gskola_bibliotek_02.JPG/225px-Malm%C3%B6_h%C3%B6gskola_bibliotek_02.JPG 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Malm%C3%B6_h%C3%B6gskola_bibliotek_02.JPG/300px-Malm%C3%B6_h%C3%B6gskola_bibliotek_02.JPG 2x\" data-file-width=\"4928\" data-file-height=\"3264\" /></a></div></div>\n\t\t\t<div class=\"gallerytext\">\n<p>Biblioteket på högsta våningen inne i <a href=\"/wiki/Orkanen_(byggnad)\" title=\"Orkanen (byggnad)\">Orkanen</a>\n</p>\n\t\t\t</div>\n\t\t</div></li>\n\t\t<li class=\"gallerybox\" style=\"width: 185px\"><div style=\"width: 185px\">\n\t\t\t<div class=\"thumb\" style=\"width: 180px;\"><div style=\"margin:33.5px auto;\"><a href=\"/wiki/Fil:Niagara,_Malm%C3%B6.jpg\" class=\"image\"><img alt=\"\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Niagara%2C_Malm%C3%B6.jpg/150px-Niagara%2C_Malm%C3%B6.jpg\" decoding=\"async\" width=\"150\" height=\"113\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Niagara%2C_Malm%C3%B6.jpg/225px-Niagara%2C_Malm%C3%B6.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Niagara%2C_Malm%C3%B6.jpg/300px-Niagara%2C_Malm%C3%B6.jpg 2x\" data-file-width=\"3355\" data-file-height=\"2519\" /></a></div></div>\n\t\t\t<div class=\"gallerytext\">\n<p><a href=\"/wiki/Niagara_(byggnad)\" title=\"Niagara (byggnad)\">Niagara</a>\n</p>\n\t\t\t</div>\n\t\t</div></li>\n</ul>\n<h2><span class=\"mw-headline\" id=\"Internationella_utbyten\">Internationella utbyten</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;veaction=edit&amp;section=6\" class=\"mw-editsection-visualeditor\" title=\"Redigera avsnitt: Internationella utbyten\">redigera</a><span class=\"mw-editsection-divider\"> | </span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;action=edit&amp;section=6\" title=\"Redigera avsnitt: Internationella utbyten\">redigera wikitext</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n<p>Malmö universitet har utbytesavtal för studenter med cirka 265 partneruniversitet i 50 länder.\n</p>\n<h2><span id=\"Personer_som_varit_anst.C3.A4llda_eller_studerat_p.C3.A5_Malm.C3.B6_universitet\"></span><span class=\"mw-headline\" id=\"Personer_som_varit_anställda_eller_studerat_på_Malmö_universitet\">Personer som varit anställda eller studerat på Malmö universitet</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;veaction=edit&amp;section=7\" class=\"mw-editsection-visualeditor\" title=\"Redigera avsnitt: Personer som varit anställda eller studerat på Malmö universitet\">redigera</a><span class=\"mw-editsection-divider\"> | </span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;action=edit&amp;section=7\" title=\"Redigera avsnitt: Personer som varit anställda eller studerat på Malmö universitet\">redigera wikitext</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n<p><i>Se även: <a href=\"/wiki/Kategori:Alumner_fr%C3%A5n_Malm%C3%B6_universitet\" title=\"Kategori:Alumner från Malmö universitet\">Kategori:Alumner från Malmö universitet</a></i>\n</p>\n<style data-mw-deduplicate=\"TemplateStyles:r49119514\">.mw-parser-output table.ambox{margin:0 10%;border-collapse:collapse;background:#fbfbfb;border:1px solid #aaa;border-left:10px solid #608ec2}.mw-parser-output table.ambox th.ambox-text,.mw-parser-output table.ambox td.ambox-text{padding:.25em .5em;width:100%}.mw-parser-output table.ambox td.ambox-image{padding:2px 0 2px .5em;text-align:center;vertical-align:middle}.mw-parser-output table.ambox td.ambox-imageright{padding:2px 4px 2px 0;text-align:center;vertical-align:middle}.mw-parser-output table.ambox-notice{border-left:10px solid #608ec2}.mw-parser-output table.ambox-delete,.mw-parser-output table.ambox-serious{border-left:10px solid #b22222}.mw-parser-output table.ambox-content{border-left:10px solid #f28500}.mw-parser-output table.ambox-style{border-left:10px solid #f4c430}.mw-parser-output table.ambox-merge{border-left:10px solid #9932cc}.mw-parser-output table.ambox-protection{border-left:10px solid #bba}.mw-parser-output .ambox+link+.ambox{border-top-width:0}.mw-parser-output .messagebox{border:1px solid #aaaaaa;background-color:#f9f9f9;width:80%;margin:0 auto 1em auto;padding:.2em}.mw-parser-output .messagebox.merge{border:1px solid #c0b8cc;background-color:#f0e5ff;text-align:center}.mw-parser-output .messagebox.cleanup{border:1px solid #9f9fff;background-color:#efefff;text-align:center}.mw-parser-output .messagebox.standard-talk{border:1px solid #c0c090;background-color:#f8eaba}.mw-parser-output .messagebox.nested-talk{border:1px solid #c0c090;background-color:#f8eaba;width:100%;margin:2px 4px}</style><table class=\"metadata ambox ambox-content\" style=\"\">\n<tbody><tr>\n<td class=\"ambox-image\">\n<div style=\"width:52px;\"><a href=\"/wiki/Fil:Question_book-4.svg\" class=\"image\"><img alt=\"Question book-4.svg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/6/64/Question_book-4.svg/40px-Question_book-4.svg.png\" decoding=\"async\" width=\"40\" height=\"31\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/6/64/Question_book-4.svg/60px-Question_book-4.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/6/64/Question_book-4.svg/80px-Question_book-4.svg.png 2x\" data-file-width=\"262\" data-file-height=\"204\" /></a></div></td>\n<td class=\"ambox-text\">Detta avsnitt <b>behöver <a href=\"/wiki/Wikipedia:K%C3%A4llh%C3%A4nvisningar\" title=\"Wikipedia:Källhänvisningar\">källhänvisningar</a> för att kunna <a href=\"/wiki/Wikipedia:Verifierbarhet\" title=\"Wikipedia:Verifierbarhet\">verifieras</a>.</b>  <small>(2013-09)</small> <br /><small>Åtgärda genom att lägga till pålitliga källor (<a href=\"/wiki/Wikipedia:Introduktion_till_k%C3%A4llh%C3%A4nvisningar\" title=\"Wikipedia:Introduktion till källhänvisningar\">gärna som fotnoter</a>). Uppgifter utan källhänvisning kan <a href=\"/wiki/Mall:K%C3%A4lla_beh%C3%B6vs\" title=\"Mall:Källa behövs\">ifrågasättas</a> och tas bort utan att det behöver diskuteras på <a href=\"/wiki/Diskussion:Malm%C3%B6_universitet\" title=\"Diskussion:Malmö universitet\">diskussionssidan</a>.</small></td>\n</tr>\n</tbody></table>\n<ul><li><a href=\"/wiki/Josefine_Adolfsson\" title=\"Josefine Adolfsson\">Josefine Adolfsson</a>, lärare på fakulteten för kultur och samhälle</li>\n<li><a href=\"/wiki/Richard_Jomshof\" title=\"Richard Jomshof\">Richard Jomshof</a>, tog examen som <a href=\"/wiki/Gymnasiel%C3%A4rare\" title=\"Gymnasielärare\">gymnasielärare</a> vid lärosätet</li>\n<li><a href=\"/wiki/Patrik_Lundberg\" title=\"Patrik Lundberg\">Patrik Lundberg</a>, tog examen i Medie- och kommunikationsvetenskap från Malmö högskola 2008</li></ul>\n<h2><span class=\"mw-headline\" id=\"Rektorer\">Rektorer</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;veaction=edit&amp;section=8\" class=\"mw-editsection-visualeditor\" title=\"Redigera avsnitt: Rektorer\">redigera</a><span class=\"mw-editsection-divider\"> | </span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;action=edit&amp;section=8\" title=\"Redigera avsnitt: Rektorer\">redigera wikitext</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n<ul><li><a href=\"/wiki/Per-Olof_Glantz\" title=\"Per-Olof Glantz\">Per-Olof Glantz</a> (1998–2002)</li>\n<li>Lennart Olausson (2002–2011)</li>\n<li><a href=\"/wiki/Stefan_Bengtsson_(professor)\" title=\"Stefan Bengtsson (professor)\">Stefan Bengtsson</a> (2011–2015)</li>\n<li><a href=\"/wiki/Kerstin_Tham\" title=\"Kerstin Tham\">Kerstin Tham</a> (1 november 2015–)</li></ul>\n<h2><span id=\"K.C3.A4llor\"></span><span class=\"mw-headline\" id=\"Källor\">Källor</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;veaction=edit&amp;section=9\" class=\"mw-editsection-visualeditor\" title=\"Redigera avsnitt: Källor\">redigera</a><span class=\"mw-editsection-divider\"> | </span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;action=edit&amp;section=9\" title=\"Redigera avsnitt: Källor\">redigera wikitext</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n<h3><span class=\"mw-headline\" id=\"Noter\">Noter</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;veaction=edit&amp;section=10\" class=\"mw-editsection-visualeditor\" title=\"Redigera avsnitt: Noter\">redigera</a><span class=\"mw-editsection-divider\"> | </span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;action=edit&amp;section=10\" title=\"Redigera avsnitt: Noter\">redigera wikitext</a><span class=\"mw-editsection-bracket\">]</span></span></h3>\n<div class=\"mw-references-wrap\"><ol class=\"references\">\n<li id=\"cite_note-om-1\">^ [<a href=\"#cite_ref-om_1-0\"><small>a</small></a> <a href=\"#cite_ref-om_1-1\"><small>b</small></a> <a href=\"#cite_ref-om_1-2\"><small>c</small></a>] <span class=\"reference-text\"><cite style=\"font-style:normal\" class=\"web\"><a rel=\"nofollow\" class=\"external text\" href=\"https://mau.se/om-oss/\">”Om oss | Malmö universitet”</a>.&#32;<i><span>mau.se</span></i><span class=\"printonly\">. <a rel=\"nofollow\" class=\"external free\" href=\"https://mau.se/om-oss/\">https://mau.se/om-oss/</a></span><span class=\"reference-accessdate\">.&#32;Läst 21 oktober 2020</span>.</cite><span class=\"Z3988\" title=\"ctx_ver=Z39.88-2004&amp;rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Abook&amp;rft.genre=bookitem&amp;rft.btitle=Om+oss+%7C+Malm%C3%B6+universitet&amp;rft.atitle=mau.se&amp;rft_id=https%3A%2F%2Fmau.se%2Fom-oss%2F&amp;rfr_id=info:sid/en.wikipedia.org:Malm%C3%B6_universitet\"><span style=\"display: none;\">&#160;</span></span></span>\n</li>\n<li id=\"cite_note-2\"><a href=\"#cite_ref-2\">^</a> <span class=\"reference-text\"><a rel=\"nofollow\" class=\"external text\" href=\"http://mah.se/Om-Malmo-hogskola/fakta-statistik/Hogskolan-i-korthet/\">24 000 inskrivna studenter</a> <a rel=\"nofollow\" class=\"external text\" href=\"https://web.archive.org/web/20130330234008/http://mah.se/Om-Malmo-hogskola/fakta-statistik/Hogskolan-i-korthet/\">Arkiverad</a> 30 mars 2013 hämtat från the <a href=\"/wiki/Internet_Archive#Wayback_Machine\" title=\"Internet Archive\">Wayback Machine</a>.</span>\n</li>\n<li id=\"cite_note-3\"><a href=\"#cite_ref-3\">^</a> <span class=\"reference-text\"><a rel=\"nofollow\" class=\"external text\" href=\"http://mah.se/Om-Malmo-hogskola/fakta-statistik/Hogskolan-i-korthet/\">1 400 anställda</a> <a rel=\"nofollow\" class=\"external text\" href=\"https://web.archive.org/web/20130330234008/http://mah.se/Om-Malmo-hogskola/fakta-statistik/Hogskolan-i-korthet/\">Arkiverad</a> 30 mars 2013 hämtat från the <a href=\"/wiki/Internet_Archive#Wayback_Machine\" title=\"Internet Archive\">Wayback Machine</a>.</span>\n</li>\n<li id=\"cite_note-4\"><a href=\"#cite_ref-4\">^</a> <span class=\"reference-text\"><cite style=\"font-style:normal\" class=\"web\"><a rel=\"nofollow\" class=\"external text\" href=\"http://www.altinget.se/utbildning/navnenyt.aspx?id=911\">”Kerstin Tham blir ny rektor vid Malmö Högskola”</a>. 11 september 2015<span class=\"printonly\">. <a rel=\"nofollow\" class=\"external free\" href=\"http://www.altinget.se/utbildning/navnenyt.aspx?id=911\">http://www.altinget.se/utbildning/navnenyt.aspx?id=911</a></span><span class=\"reference-accessdate\">.&#32;Läst 15 september 2015</span>.</cite><span class=\"Z3988\" title=\"ctx_ver=Z39.88-2004&amp;rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Abook&amp;rft.genre=bookitem&amp;rft.btitle=Kerstin+Tham+blir+ny+rektor+vid+Malm%C3%B6+H%C3%B6gskola&amp;rft.atitle=&amp;rft.date=11+september+2015&amp;rft_id=http%3A%2F%2Fwww.altinget.se%2Futbildning%2Fnavnenyt.aspx%3Fid%3D911&amp;rfr_id=info:sid/en.wikipedia.org:Malm%C3%B6_universitet\"><span style=\"display: none;\">&#160;</span></span></span>\n</li>\n<li id=\"cite_note-5\"><a href=\"#cite_ref-5\">^</a> <span class=\"reference-text\"><cite style=\"font-style:normal\" class=\"web\"><a rel=\"nofollow\" class=\"external text\" href=\"https://web.archive.org/web/20120402184417/http://www.hsv.se/download/18.539a949110f3d5914ec800089640/out.html\">”5.2 Vårdhögskolor”</a>&#32;(PDF).&#32;<i><span>Vårdutbildningar i högskolan: En utvärdering</span></i>. <a href=\"/wiki/H%C3%B6gskoleverket\" title=\"Högskoleverket\">Högskoleverket</a>. 1996. sid.&#160;37. Arkiverad från <a rel=\"nofollow\" class=\"external text\" href=\"http://www.hsv.se/download/18.539a949110f3d5914ec800089640/out.html\">originalet</a>&#32;den 2 april 2012<span class=\"printonly\">. <a rel=\"nofollow\" class=\"external free\" href=\"https://web.archive.org/web/20120402184417/http://www.hsv.se/download/18.539a949110f3d5914ec800089640/out.html\">https://web.archive.org/web/20120402184417/http://www.hsv.se/download/18.539a949110f3d5914ec800089640/out.html</a></span><span class=\"reference-accessdate\">.&#32;Läst 6 oktober 2011</span>.</cite><span class=\"Z3988\" title=\"ctx_ver=Z39.88-2004&amp;rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Abook&amp;rft.genre=bookitem&amp;rft.btitle=5.2+V%C3%A5rdh%C3%B6gskolor&amp;rft.atitle=V%C3%A5rdutbildningar+i+h%C3%B6gskolan%3A+En+utv%C3%A4rdering&amp;rft.date=1996&amp;rft.pages=sid.%26nbsp%3B37&amp;rft.pub=%5B%5BH%C3%B6gskoleverket%5D%5D&amp;rft_id=https%3A%2F%2Fweb.archive.org%2Fweb%2F20120402184417%2Fhttp%3A%2F%2Fwww.hsv.se%2Fdownload%2F18.539a949110f3d5914ec800089640%2Fout.html&amp;rfr_id=info:sid/en.wikipedia.org:Malm%C3%B6_universitet\"><span style=\"display: none;\">&#160;</span></span></span>\n</li>\n<li id=\"cite_note-6\"><a href=\"#cite_ref-6\">^</a> <span class=\"reference-text\"><cite style=\"font-style:normal\" class=\"web\"><a rel=\"nofollow\" class=\"external text\" href=\"http://www.sydsvenskan.se/2016-06-16/malmo-hogskola-ska-bli-universitet\">””Malmö högskola ska bli universitet””</a>. <a href=\"/wiki/Sydsvenskan\" title=\"Sydsvenskan\">Sydsvenskan</a>. 16 juni 2016<span class=\"printonly\">. <a rel=\"nofollow\" class=\"external free\" href=\"http://www.sydsvenskan.se/2016-06-16/malmo-hogskola-ska-bli-universitet\">http://www.sydsvenskan.se/2016-06-16/malmo-hogskola-ska-bli-universitet</a></span><span class=\"reference-accessdate\">.&#32;Läst 16 juni 2016</span>.</cite><span class=\"Z3988\" title=\"ctx_ver=Z39.88-2004&amp;rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Abook&amp;rft.genre=bookitem&amp;rft.btitle=%E2%80%9DMalm%C3%B6+h%C3%B6gskola+ska+bli+universitet%E2%80%9D&amp;rft.atitle=&amp;rft.date=16+juni+2016&amp;rft.pub=%5B%5BSydsvenskan%5D%5D&amp;rft_id=http%3A%2F%2Fwww.sydsvenskan.se%2F2016-06-16%2Fmalmo-hogskola-ska-bli-universitet&amp;rfr_id=info:sid/en.wikipedia.org:Malm%C3%B6_universitet\"><span style=\"display: none;\">&#160;</span></span></span>\n</li>\n<li id=\"cite_note-7\"><a href=\"#cite_ref-7\">^</a> <span class=\"reference-text\"><cite style=\"font-style:normal\" class=\"web\"><a rel=\"nofollow\" class=\"external text\" href=\"https://web.archive.org/web/20160617073919/http://www.regeringen.se/pressmeddelanden/2016/06/malmo-hogskola-blir-universitet/\">”Malmö högskola blir universitet - Regeringen.se”</a>. 17 juni 2016. Arkiverad från <a rel=\"nofollow\" class=\"external text\" href=\"http://www.regeringen.se/pressmeddelanden/2016/06/malmo-hogskola-blir-universitet/\">originalet</a>&#32;den 17 juni 2016<span class=\"printonly\">. <a rel=\"nofollow\" class=\"external free\" href=\"https://web.archive.org/web/20160617073919/http://www.regeringen.se/pressmeddelanden/2016/06/malmo-hogskola-blir-universitet/\">https://web.archive.org/web/20160617073919/http://www.regeringen.se/pressmeddelanden/2016/06/malmo-hogskola-blir-universitet/</a></span><span class=\"reference-accessdate\">.&#32;Läst 17 juni 2016</span>.</cite><span class=\"Z3988\" title=\"ctx_ver=Z39.88-2004&amp;rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Abook&amp;rft.genre=bookitem&amp;rft.btitle=Malm%C3%B6+h%C3%B6gskola+blir+universitet+-+Regeringen.se&amp;rft.atitle=&amp;rft.date=17+juni+2016&amp;rft_id=https%3A%2F%2Fweb.archive.org%2Fweb%2F20160617073919%2Fhttp%3A%2F%2Fwww.regeringen.se%2Fpressmeddelanden%2F2016%2F06%2Fmalmo-hogskola-blir-universitet%2F&amp;rfr_id=info:sid/en.wikipedia.org:Malm%C3%B6_universitet\"><span style=\"display: none;\">&#160;</span></span></span>\n</li>\n</ol></div>\n<h2><span id=\"Externa_l.C3.A4nkar\"></span><span class=\"mw-headline\" id=\"Externa_länkar\">Externa länkar</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;veaction=edit&amp;section=11\" class=\"mw-editsection-visualeditor\" title=\"Redigera avsnitt: Externa länkar\">redigera</a><span class=\"mw-editsection-divider\"> | </span><a href=\"/w/index.php?title=Malm%C3%B6_universitet&amp;action=edit&amp;section=11\" title=\"Redigera avsnitt: Externa länkar\">redigera wikitext</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n<ul><li><img alt=\"Commons-logo.svg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Commons-logo.svg/15px-Commons-logo.svg.png\" decoding=\"async\" width=\"15\" height=\"20\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Commons-logo.svg/23px-Commons-logo.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Commons-logo.svg/30px-Commons-logo.svg.png 2x\" data-file-width=\"1024\" data-file-height=\"1376\" /> Wikimedia Commons har media som rör <a href=\"https://commons.wikimedia.org/wiki/Category:Malm%C3%B6_h%C3%B6gskola\" class=\"extiw\" title=\"commons:Category:Malmö högskola\">Malmö universitet</a>.<div class=\"interProject commons\" style=\"display:none;\"><a href=\"https://commons.wikimedia.org/wiki/Category:Malm%C3%B6_h%C3%B6gskola\" class=\"extiw\" title=\"commons:Category:Malmö högskola\">Bilder &amp; media</a></div></li>\n<li><a rel=\"nofollow\" class=\"external text\" href=\"https://www.mau.se/\">Malmö universitets webbplats</a></li></ul>\n<style data-mw-deduplicate=\"TemplateStyles:r47621209\">.mw-parser-output table.navbox{border:#aaa 1px solid;width:100%;margin:auto;margin-top:1em;clear:both;font-size:88%;text-align:center;padding:1px}.mw-parser-output link+table.navbox{margin-top:-1px}.mw-parser-output .navbox-title,.mw-parser-output .navbox-abovebelow,.mw-parser-output table.navbox th{text-align:center;padding-left:1em;padding-right:1em}.mw-parser-output .navbox-thlinkcolor .navbox-title a{color:inherit}.mw-parser-output .nowraplinks a,.mw-parser-output .nowraplinks .selflink{white-space:nowrap}.mw-parser-output .navbox-group{white-space:nowrap;text-align:right;font-weight:bold;padding-left:1em;padding-right:1em}.mw-parser-output .navbox,.mw-parser-output .navbox-subgroup{background:#fdfdfd}.mw-parser-output .navbox-list{border-color:#fdfdfd}.mw-parser-output .navbox-title,.mw-parser-output table.navbox th{background:#b0c4de}.mw-parser-output .navbox-abovebelow,.mw-parser-output .navbox-group,.mw-parser-output .navbox-subgroup .navbox-title{background:#d0e0f5}.mw-parser-output .navbox-subgroup .navbox-group,.mw-parser-output .navbox-subgroup .navbox-abovebelow{background:#deeafa}.mw-parser-output .navbox-even{background:#f7f7f7}.mw-parser-output .navbox-odd{background:transparent}</style><table class=\"navbox\" style=\"border-spacing:0; ;\"><tbody><tr><td style=\"padding:2px;\"><table class=\"nowraplinks collapsible autocollapse\" style=\"width:100%;border-spacing:0;background:transparent;color:inherit;;\"><tbody><tr><th style=\";\" colspan=\"2\" class=\"navbox-title\"><div style=\"float:left; width:3em;text-align:left;\"><div class=\"noprint plainlinks\" style=\"background-color:transparent; padding:0; white-space:nowrap; font-weight:normal; font-size:80%; border:none;;\"><a href=\"/wiki/Mall:L%C3%A4ros%C3%A4ten_i_Sverige\" title=\"Mall:Lärosäten i Sverige\"><span title=\"Visa denna mall\" style=\"border:none;;\">v</span></a>&#160;<span style=\"font-size:80%;\">•</span>&#160;<a class=\"external text\" href=\"https://sv.wikipedia.org/w/index.php?title=Mall:L%C3%A4ros%C3%A4ten_i_Sverige&amp;action=edit\"><span style=\"border:none;;\" title=\"Redigera den här mallen\">r</span></a></div></div><span style=\"font-size:110%;\">Statliga <a href=\"/wiki/H%C3%B6gskolor_och_universitet_i_Sverige\" title=\"Högskolor och universitet i Sverige\">högskolor och universitet i Sverige</a></span></th></tr><tr style=\"height:2px;\"><td></td></tr><tr><td class=\"navbox-group\" style=\";;\">Universitet</td><td style=\"text-align:left;border-left:2px solid #fdfdfd;width:100%;padding:0px;;;\" class=\"navbox-list navbox-\"><div style=\"padding:0em 0.25em\"><a href=\"/wiki/Uppsala_universitet\" title=\"Uppsala universitet\">Uppsala universitet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Lunds_universitet\" title=\"Lunds universitet\">Lunds universitet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/G%C3%B6teborgs_universitet\" title=\"Göteborgs universitet\">Göteborgs universitet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Stockholms_universitet\" title=\"Stockholms universitet\">Stockholms universitet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Ume%C3%A5_universitet\" title=\"Umeå universitet\">Umeå universitet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Link%C3%B6pings_universitet\" title=\"Linköpings universitet\">Linköpings universitet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Karolinska_institutet\" class=\"mw-redirect\" title=\"Karolinska institutet\">Karolinska institutet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Kungliga_Tekniska_h%C3%B6gskolan\" title=\"Kungliga Tekniska högskolan\">Kungl. Tekniska högskolan</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Lule%C3%A5_tekniska_universitet\" title=\"Luleå tekniska universitet\">Luleå tekniska universitet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Karlstads_universitet\" title=\"Karlstads universitet\">Karlstads universitet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Linn%C3%A9universitetet\" title=\"Linnéuniversitetet\">Linnéuniversitetet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/%C3%96rebro_universitet\" title=\"Örebro universitet\">Örebro universitet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Mittuniversitetet\" title=\"Mittuniversitetet\">Mittuniversitetet</a><span style=\"font-weight:bold;\">&#160;· </span> <a class=\"mw-selflink selflink\">Malmö universitet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/M%C3%A4lardalens_universitet\" title=\"Mälardalens universitet\">Mälardalens universitet</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Sveriges_lantbruksuniversitet\" title=\"Sveriges lantbruksuniversitet\">Sveriges lantbruksuniversitet</a></div></td></tr><tr style=\"height:2px\"><td></td></tr><tr><td class=\"navbox-group\" style=\";;\">Högskolor</td><td style=\"text-align:left;border-left:2px solid #fdfdfd;width:100%;padding:0px;;;\" class=\"navbox-list navbox-\"><div style=\"padding:0em 0.25em\"><a href=\"/wiki/Blekinge_tekniska_h%C3%B6gskola\" title=\"Blekinge tekniska högskola\">Blekinge tekniska högskola</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/F%C3%B6rsvarsh%C3%B6gskolan,_Sverige\" title=\"Försvarshögskolan, Sverige\">Försvarshögskolan</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Gymnastik-_och_idrottsh%C3%B6gskolan\" title=\"Gymnastik- och idrottshögskolan\">Gymnastik- och idrottshögskolan</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/H%C3%B6gskolan_i_Bor%C3%A5s\" title=\"Högskolan i Borås\">Högskolan i Borås</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/H%C3%B6gskolan_Dalarna\" title=\"Högskolan Dalarna\">Högskolan Dalarna</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/H%C3%B6gskolan_i_G%C3%A4vle\" title=\"Högskolan i Gävle\">Högskolan i Gävle</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/H%C3%B6gskolan_i_Halmstad\" title=\"Högskolan i Halmstad\">Högskolan i Halmstad</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/H%C3%B6gskolan_Kristianstad\" title=\"Högskolan Kristianstad\">Högskolan Kristianstad</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/H%C3%B6gskolan_i_Sk%C3%B6vde\" title=\"Högskolan i Skövde\">Högskolan i Skövde</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/H%C3%B6gskolan_V%C3%A4st\" title=\"Högskolan Väst\">Högskolan Väst</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Konstfack\" title=\"Konstfack\">Konstfack</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Kungliga_Konsth%C3%B6gskolan\" title=\"Kungliga Konsthögskolan\">Kungliga Konsthögskolan</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Kungliga_Musikh%C3%B6gskolan_i_Stockholm\" title=\"Kungliga Musikhögskolan i Stockholm\">Kungliga Musikhögskolan i Stockholm</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/Stockholms_konstn%C3%A4rliga_h%C3%B6gskola\" title=\"Stockholms konstnärliga högskola\">Stockholms konstnärliga högskola</a><span style=\"font-weight:bold;\">&#160;· </span> <a href=\"/wiki/S%C3%B6dert%C3%B6rns_h%C3%B6gskola\" title=\"Södertörns högskola\">Södertörns högskola</a></div></td></tr></tbody></table></td></tr></tbody></table>\n<!-- \nNewPP limit report\nParsed by mw1360\nCached time: 20220101200715\nCache expiry: 1814400\nReduced expiry: false\nComplications: []\nCPU time usage: 0.497 seconds\nReal time usage: 0.579 seconds\nPreprocessor visited node count: 6517/1000000\nPost‐expand include size: 53201/2097152 bytes\nTemplate argument size: 23037/2097152 bytes\nHighest expansion depth: 17/40\nExpensive parser function count: 0/500\nUnstrip recursion depth: 0/20\nUnstrip post‐expand size: 18884/5000000 bytes\nLua time usage: 0.056/10.000 seconds\nLua memory usage: 1837703/52428800 bytes\nNumber of Wikibase entities loaded: 1/400\n-->\n<!--\nTransclusion expansion time report (%,ms,calls,template)\n100.00%  509.825      1 -total\n 28.64%  146.013      1 Mall:Universitet\n 27.51%  140.254      1 Mall:Faktamall\n 22.99%  117.204      5 Mall:Webbref\n 20.47%  104.383      5 Mall:Cite_web\n 15.86%   80.839      5 Mall:Citation/core\n 14.90%   75.970      1 Mall:Lärosäten_i_Sverige\n 14.02%   71.494      1 Mall:Navbox\n 10.15%   51.752      1 Mall:Källor\n  9.07%   46.216      1 Mall:Källor_metamall\n-->\n\n<!-- Saved in parser cache with key svwiki:pcache:idhash:89540-0!canonical and timestamp 20220101200714 and revision id 49915931. Serialized with JSON.\n -->\n</div>"}}



function setupAutocomplete(inp,origin) {
    autocomplete(inp, arr, origin);
}

function setArticle(article) {
    let text = document.createElement("DIV");
    text.innerHTML = article.text
    let elements = text.getElementsByTagName("a");

    for(i = 0; i < elements.length; i++){
        elements[i].id = "aWikiElem" + i;
    }

    document.getElementById("wikiText").innerHTML = text.innerHTML;
    document.getElementById("wiki-title").innerHTML = article.title;

    for(i = 0; i < elements.length; i++){
        let element = document.getElementById("aWikiElem" + i);
        if(!element.href.includes("#")){
            element.href = element.href.replace("http://localhost:8080", "https://sv.wikipedia.org");
        }
    }
    $(".mw-editsection").css("visibility", "hidden");
}


window.addEventListener("load", function () {
    setArticle(article.parse);
    let showHide = document.getElementById("visibility");
    $(showHide).css("visibility", "hidden");
    let mapShowHide = this.document.getElementById("map");
    $(mapShowHide).css("visibility", "hidden");
    let a = document.getElementById("till-box");
    $(a).css("z-index", 0);

    let b = document.getElementById("wiki-articles");
    $(b).css("z-index", 0);

    let call = $.ajax({
        url: '/api/v2/stops',
        headers: {"Accept": "application/json"}
    })
        .done(function (data) {
            arr = data;
            setupAutocomplete(document.getElementById("origin-stop"),true);
            setupAutocomplete(document.getElementById("destination-stop"),false);
        });
});

function buttonSearchRoutePressed(){
    if (!(origin === undefined) && !(destination === undefined)) {
        let button = document.getElementById("button-search-route");
        button.disabled = true;
        button.innerHTML = "<span className='spinner-grow spinner-grow-sm' role='status' aria-hidden='true'></span><span className='sr-only'>Laddar...</span>"

        let createCall = $.ajax({
            method: "POST",
            url: "/api/v2/wikiPaths?originID="+ origin.id + "&destinationID=" + destination.id + "&showTimes=true&numArticles=15" ,
            headers: {"Accept": "application/json"},
        }).done(function () {
                var pages;
                let getListCall = $.ajax({
                    method: "GET",
                    url: "/api/v2/wikiPaths" ,
                    headers: {"Accept": "application/json"},
                    async: false
                }).done(function (data) {
                        pages = data;
                        let getArticleCall = $.ajax({
                            method: "GET",
                            url: "/api/v2/wikiPaths/" + pages[pages.length-1].ID ,
                            headers: {"Accept": "application/json"}
                        })
                            .done(function (data) {
                                route = data;
                                loadStop(route);
                                zoom = 12;
                                buildMapPath();
                                initMap();
                            });
                    });
            });
    } else {
        alert("Vänligen välj ny rutt");
        document.getElementById("origin-stop").value = "";
        document.getElementById("destination-stop").value = "";
    }
}

let currentStop = 0;
let route;

function buildMapPath() {
    for (let i = 0; i < route.wikiPath.length; i++) {
        let coordinate;
        coordinate = {lat: route.wikiPath[i].queryLat, lng: route.wikiPath[i].queryLon};
        mapPath[i] = coordinate;
    }
}

function loadNextStop(){
    if (currentStop < route.wikiPath.length-1){
        currentStop++;
        loadStop(route);
    } else {
        alert("Du är redan på sista hållplatsen!");
    }

}
function loadPreviousStop(){
    if (currentStop != 0) {
        currentStop--;
        loadStop(route);
    } else {
        alert("Du är redan på första hållplatsen!");
    }

}

let mapPath = [];
let mapLat = 59.330460589069624;
let mapLng = 18.059311900276285;
let zoom = 6;
let map;

function initMap() {
    map = new google.maps.Map(document.getElementById("map"), {
        zoom: zoom,
        center: {lat: mapLat, lng: mapLng},
        mapTypeId: "terrain",
        disableDefaultUI: true,
    });

    const flightPath = new google.maps.Polyline({
        path: mapPath,
        geodesic: true,
        strokeColor: "#FF0000",
        strokeOpacity: 1.0,
        strokeWeight: 2,
    });

    flightPath.setMap(map);
    updateMap();
}

let marker;
function updateMap() {
    let coordinate;
    coordinate = {lat: mapLat, lng: mapLng};
    map.setCenter(coordinate);

    if (marker != undefined) {
        marker.setMap(null);
    }
    marker = new google.maps.Marker({
        position: coordinate,
        map,
    });
}

function loadStop(route) {

    let stop = route.wikiPath[currentStop];
    mapLat = stop.queryLat;
    mapLng = stop.queryLon;
    updateMap();

    let currentStation = document.getElementById("current-station");
    currentStation.innerHTML = stop.stopName + " (" + (currentStop+1) + "/" + route.wikiPath.length + ")";

    let pages = stop.pages;
    let wikiArticles = document.getElementById("wiki-articles");
    wikiArticles.innerHTML = "";

    for(i = 0; i<pages.length; i++){
        const wikiLinkElement = document.createElement("a");
        wikiLinkElement.setAttribute("class", "list-group-item list-group-item-action text-truncate ");
        wikiLinkElement.setAttribute("data-toggle", "tooltip");
        wikiLinkElement.setAttribute("data-placement", "top");
        wikiLinkElement.setAttribute("title", pages[i].title + " (" + pages[i].dist + "m)");

        wikiLinkElement.setAttribute("href", "wiki?pageid=" + pages[i].pageid);

        wikiLinkElement.innerHTML = pages[i].title + " (" + pages[i].dist + "m)";


        $(wikiLinkElement).on('click', function(e) {

            e.preventDefault();

            let url = $(this).attr('href');

            let call = $.ajax({
                method: "GET",
                url: "/api/v2/" + url,
                headers: {"Accept": "application/json"}
            }).done(function (data){
                article = data;
                setArticle(article.parse);
            });
        });

        wikiArticles.appendChild(wikiLinkElement);

        showHide = document.getElementById("visibility");
        $(showHide).css("visibility", "visible");
        mapShowHide = document.getElementById("map");
        $(mapShowHide).css("visibility", "visible");

        let button = document.getElementById("button-search-route");
        button.disabled = false;
        button.innerHTML = "Sök rutt"

    }
}



function autocomplete(inp, arr, isOrigin, limit) {
    let currentFocus;
    limit = limit || 10;
    inp.addEventListener("input", function(e) {
        let a, b, i, val = this.value;
        closeAllLists();
        if (!val) { return false;}
        currentFocus = -1;
        a = document.createElement("DIV");
        
        a.setAttribute("id", this.id + "autocomplete-list");
        a.setAttribute("style", "max-height: 150px;");
        a.setAttribute("class", "d-inline");
        a.setAttribute("class", "overflow-auto");
        a.setAttribute("class", "autocomplete-items");
        $(a).css({"background-color":"white","max-height": "200px", "overflow": "auto","position": "absolute","display" : "block"});
        $(a).css("z-index",10000000);

        q = document.getElementById("till-box");
        let width = $(q).width();
        $(a).css("width", width + "px");

        this.parentNode.appendChild(a);

        for (i = 0; i < arr.length; i++) {

            if (arr[i].name.substr(0, val.length).toUpperCase() == val.toUpperCase()) {
                b = document.createElement("DIV");
                b.setAttribute("style", "background-color: white;");
                b.setAttribute("style", "border-bottom: 1px dotted #999;");
                b.innerHTML = "<strong>" + arr[i].name.substr(0, val.length) + "</strong>";
                b.innerHTML += arr[i].name.substr(val.length);
                b.innerHTML += "<input type='hidden' value='" + arr[i].name + "'>";
                b.stop = arr[i];
                b.isOrigin = isOrigin;

                b.addEventListener("click", function(e) {
                    inp.value = this.getElementsByTagName("input")[0].value;

                    if (this.isOrigin) {
                        origin = this.stop;
                    } else {
                        destination = this.stop;
                    }

                    closeAllLists();
                });
                a.appendChild(b);
            }
        }
    });

    function addActive(x) {
        if (!x) return false;
        removeActive(x);
        if (currentFocus >= x.length) currentFocus = 0;
        if (currentFocus < 0) currentFocus = (x.length - 1);
        x[currentFocus].classList.add("autocomplete-active");
    }
    function removeActive(x) {
        for (let i = 0; i < x.length; i++) {
            x[i].classList.remove("autocomplete-active");
        }
    }
    function closeAllLists(elmnt) {
        let x = document.getElementsByClassName("autocomplete-items");
        for (let i = 0; i < x.length; i++) {
            if (elmnt != x[i] && elmnt != inp) {
                x[i].parentNode.removeChild(x[i]);
            }
        }
    }
    document.addEventListener("click", function (e) {
        closeAllLists(e.target);
    });
}




