package collprac;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class swapMapVal {
    public static void main(String[] args) throws Exception {
        // Parse the JSON string into a Map object
        String json = "{\"CA501\":\"T1\",\"CA510\":\"T10\",\"LA307\":\"T100\",\"LA308\":\"T101\",\"LA309\":\"T102\",\"LA310\":\"T103\",\"LA311\":\"T104\",\"LA312\":\"T105\",\"LA313\":\"T106\",\"LA314\":\"T107\",\"LA315\":\"T108\",\"LA316\":\"T109\",\"CA511\":\"T11\",\"LA317\":\"T110\",\"LA318\":\"T111\",\"LA319\":\"T112\",\"LA320\":\"T113\",\"LA321\":\"T114\",\"LA322\":\"T115\",\"LA323\":\"T116\",\"LA324\":\"T117\",\"LA325\":\"T118\",\"LA326\":\"T119\",\"CA512\":\"T12\",\"LA327\":\"T120\",\"LA328\":\"T121\",\"LA329\":\"T122\",\"LA330\":\"T123\",\"LA331\":\"T124\",\"LA332\":\"T125\",\"LA333\":\"T126\",\"LA334\":\"T127\",\"LA335\":\"T128\",\"LA336\":\"T129\",\"CA513\":\"T13\",\"LA337\":\"T130\",\"LA338\":\"T131\",\"LA339\":\"T132\",\"LA340\":\"T133\",\"LA341\":\"T134\",\"LA342\":\"T135\",\"LA343\":\"T136\",\"LA344\":\"T137\",\"LA345\":\"T138\",\"LA346\":\"T139\",\"CA514\":\"T14\",\"LA347\":\"T140\",\"LA348\":\"T141\",\"LA349\":\"T142\",\"LA350\":\"T143\",\"LA351\":\"T144\",\"LA352\":\"T145\",\"LA353\":\"T146\",\"LA354\":\"T147\",\"LA355\":\"T148\",\"LA356\":\"T149\",\"CA515\":\"T15\",\"LA357\":\"T150\",\"LA358\":\"T151\",\"LA359\":\"T152\",\"LA360\":\"T153\",\"LA361\":\"T154\",\"LA362\":\"T155\",\"LA363\":\"T156\",\"LA364\":\"T157\",\"LA365\":\"T158\",\"LA366\":\"T159\",\"CA516\":\"T16\",\"LA367\":\"T160\",\"LA368\":\"T161\",\"LA369\":\"T162\",\"LA370\":\"T163\",\"LA371\":\"T164\",\"LA372\":\"T165\",\"LA373\":\"T166\",\"LA374\":\"T167\",\"LA375\":\"T168\",\"LA377\":\"T169\",\"CA517\":\"T17\",\"LA378\":\"T170\",\"LA379\":\"T171\",\"LA380\":\"T172\",\"LA381\":\"T173\",\"LA382\":\"T174\",\"LA383\":\"T175\",\"LA384\":\"T176\",\"LA385\":\"T177\",\"MCDOM\":\"T178\",\"MCGEN\":\"T179\",\"CA518\":\"T18\",\"NUBOA\":\"T180\",\"NUBOL\":\"T181\",\"OA110\":\"T182\",\"OA111\":\"T183\",\"OA112\":\"T184\",\"OABAS\":\"T185\",\"OABLI\":\"T186\",\"OAPCR\":\"T187\",\"OAPDR\":\"T188\",\"OARNU\":\"T189\",\"CA519\":\"T19\",\"OD401\":\"T190\",\"OD402\":\"T191\",\"OD403\":\"T192\",\"OD404\":\"T193\",\"OD405\":\"T194\",\"OD406\":\"T195\",\"OD407\":\"T196\",\"OD408\":\"T197\",\"OD409\":\"T198\",\"OD410\":\"T199\",\"CA502\":\"T2\",\"CA520\":\"T20\",\"OD411\":\"T200\",\"OD412\":\"T201\",\"OD413\":\"T202\",\"OD414\":\"T203\",\"OD415\":\"T204\",\"OD416\":\"T205\",\"OD417\":\"T206\",\"OD418\":\"T207\",\"OD420\":\"T208\",\"OD421\":\"T209\",\"CA521\":\"T21\",\"OD440\":\"T210\",\"OD441\":\"T211\",\"OD442\":\"T212\",\"OD451\":\"T213\",\"OD452\":\"T214\",\"OD482\":\"T215\",\"OD491\":\"T216\",\"OSPCR\":\"T217\",\"RM707\":\"T218\",\"SB601\":\"T219\",\"CA522\":\"T22\",\"SB602\":\"T220\",\"SB603\":\"T221\",\"SB604\":\"T222\",\"SB605\":\"T223\",\"SB606\":\"T224\",\"SB607\":\"T225\",\"SB608\":\"T226\",\"SB609\":\"T227\",\"SB610\":\"T228\",\"SB611\":\"T229\",\"CA523\":\"T23\",\"SB612\":\"T230\",\"SB613\":\"T231\",\"SB614\":\"T232\",\"SB615\":\"T233\",\"SB616\":\"T234\",\"SB617\":\"T235\",\"SB618\":\"T236\",\"SB619\":\"T237\",\"SB620\":\"T238\",\"SB621\":\"T239\",\"CA524\":\"T24\",\"SB622\":\"T240\",\"SB623\":\"T241\",\"SB624\":\"T242\",\"SB625\":\"T243\",\"SB626\":\"T244\",\"SB627\":\"T245\",\"SB628\":\"T246\",\"SB629\":\"T247\",\"SB630\":\"T248\",\"SB631\":\"T249\",\"CA525\":\"T25\",\"SB632\":\"T250\",\"SB633\":\"T251\",\"SB636\":\"T252\",\"SB637\":\"T253\",\"SB640\":\"T254\",\"SB644\":\"T255\",\"SB649\":\"T256\",\"SB650\":\"T257\",\"SB651\":\"T258\",\"SB652\":\"T259\",\"CA526\":\"T26\",\"SB653\":\"T260\",\"SB654\":\"T261\",\"SB655\":\"T262\",\"SB656\":\"T263\",\"SB657\":\"T264\",\"SB659\":\"T265\",\"SB660\":\"T266\",\"SB661\":\"T267\",\"SB681\":\"T268\",\"SB682\":\"T269\",\"CA527\":\"T27\",\"SB683\":\"T270\",\"SB684\":\"T271\",\"SB685\":\"T272\",\"SB686\":\"T273\",\"SB687\":\"T274\",\"SB688\":\"T275\",\"SB689\":\"T276\",\"SB690\":\"T277\",\"SB691\":\"T278\",\"SB692\":\"T279\",\"CA528\":\"T28\",\"SB693\":\"T280\",\"SB694\":\"T281\",\"SB697\":\"T282\",\"TD701\":\"T283\",\"TD702\":\"T284\",\"TD704\":\"T285\",\"TD705\":\"T286\",\"TD706\":\"T287\",\"TD709\":\"T288\",\"TD710\":\"T289\",\"CA529\":\"T29\",\"TD711\":\"T290\",\"TD712\":\"T291\",\"TD713\":\"T292\",\"TD715\":\"T293\",\"TD716\":\"T294\",\"TD717\":\"T295\",\"TD719\":\"T296\",\"TD720\":\"T297\",\"TD723\":\"T298\",\"TD724\":\"T299\",\"CA503\":\"T3\",\"CA530\":\"T30\",\"TD725\":\"T300\",\"TD726\":\"T301\",\"TD727\":\"T302\",\"TD729\":\"T303\",\"TD732\":\"T304\",\"TD734\":\"T305\",\"TD735\":\"T306\",\"TD736\":\"T307\",\"TD737\":\"T308\",\"TD739\":\"T309\",\"CA531\":\"T31\",\"TD751\":\"T310\",\"TD752\":\"T311\",\"TD753\":\"T312\",\"TD754\":\"T313\",\"TD755\":\"T314\",\"TD756\":\"T315\",\"TD803\":\"T316\",\"TD813\":\"T317\",\"TD815\":\"T318\",\"TEST\":\"T319\",\"CA532\":\"T32\",\"TU801\":\"T320\",\"TU802\":\"T321\",\"TU803\":\"T322\",\"TU804\":\"T323\",\"TU805\":\"T324\",\"TU806\":\"T325\",\"TU807\":\"T326\",\"TU808\":\"T327\",\"TU809\":\"T328\",\"TU810\":\"T329\",\"CA533\":\"T33\",\"TU811\":\"T330\",\"TU812\":\"T331\",\"TU813\":\"T332\",\"TU814\":\"T333\",\"TU815\":\"T334\",\"TU816\":\"T335\",\"TU817\":\"T336\",\"TU818\":\"T337\",\"TU819\":\"T338\",\"TU820\":\"T339\",\"CA535\":\"T34\",\"TU821\":\"T340\",\"TU822\":\"T341\",\"TU823\":\"T342\",\"TU824\":\"T343\",\"TU825\":\"T344\",\"TU840\":\"T345\",\"TU841\":\"T346\",\"TU842\":\"T347\",\"TU843\":\"T348\",\"CA536\":\"T35\",\"CA537\":\"T36\",\"CA538\":\"T37\",\"CA539\":\"T38\",\"CA540\":\"T39\",\"CA504\":\"T4\",\"CA541\":\"T40\",\"CA542\":\"T41\",\"CA543\":\"T42\",\"CA544\":\"T43\",\"CA545\":\"T44\",\"CA546\":\"T45\",\"CA547\":\"T46\",\"CA548\":\"T47\",\"CA549\":\"T48\",\"CA551\":\"T49\",\"CA505\":\"T5\",\"CA552\":\"T50\",\"CA553\":\"T51\",\"CA554\":\"T52\",\"CA555\":\"T53\",\"CA559\":\"T54\",\"CA560\":\"T55\",\"CA561\":\"T56\",\"CA562\":\"T57\",\"CA563\":\"T58\",\"CA564\":\"T59\",\"CA506\":\"T6\",\"CA565\":\"T60\",\"CA566\":\"T61\",\"CA567\":\"T62\",\"CA568\":\"T63\",\"CA570\":\"T64\",\"CA575\":\"T65\",\"CA576\":\"T66\",\"CA577\":\"T67\",\"CA578\":\"T68\",\"CA579\":\"T69\",\"CA507\":\"T7\",\"CA580\":\"T70\",\"CA581\":\"T71\",\"CA582\":\"T72\",\"CA583\":\"T73\",\"CA584\":\"T74\",\"CA593\":\"T75\",\"CA594\":\"T76\",\"CA597\":\"T77\",\"CA598\":\"T78\",\"CA599\":\"T79\",\"CA508\":\"T8\",\"CA901\":\"T80\",\"CA902\":\"T81\",\"CA903\":\"T82\",\"CA904\":\"T83\",\"CA905\":\"T84\",\"CA906\":\"T85\",\"CA907\":\"T86\",\"CA908\":\"T87\",\"CA910\":\"T88\",\"CA911\":\"T89\",\"CA509\":\"T9\",\"CL401\":\"T90\",\"DDGEN\":\"T91\",\"HOCAS\":\"T92\",\"HOCLI\":\"T93\",\"LA301\":\"T94\",\"LA302\":\"T95\",\"LA303\":\"T96\",\"LA304\":\"T97\",\"LA305\":\"T98\",\"LA306\":\"T99\"}";
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Integer> map = mapper.readValue(json, Map.class);

        // Create a new empty map with integer keys and string values
        Map<Integer, String> invertedMap = new HashMap<>();

        // Iterate over the entries in the original map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // Add a new entry to the inverted map with the value as the key and the key as the value
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        ObjectMapper mapperss = new ObjectMapper();

        String str = mapperss.writeValueAsString(invertedMap);

        // Print the inverted map
        System.out.println(str);
    }
}

